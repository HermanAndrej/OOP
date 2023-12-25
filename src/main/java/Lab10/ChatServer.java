package Lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<ClientHandler> clientHandlerList = new ArrayList<>();

    public void start(int portNumber){

        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Server is running!");

            while(true){
                Socket connection = serverSocket.accept();
                System.out.println("New client connected: " + connection.getInetAddress());

                ClientHandler clientHandler = new ClientHandler(connection, this);
                clientHandlerList.add(clientHandler);

                Thread clientThread = new Thread(clientHandler);
                clientThread.start();
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    private void broadcastMessage(String message, ClientHandler sender){
        for(ClientHandler client : clientHandlerList){
            if(client != sender){
                client.sendMessage(message);
            }
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private BufferedReader reader;
        private PrintWriter writer;
        private ChatServer chatServer;

        public ClientHandler(Socket clientSocket, ChatServer chatServer) {
            this.clientSocket = clientSocket;
            this.chatServer = chatServer;

            try {
                // Initialize BufferedReader and PrintWriter
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                System.err.println("Error initializing reader/writer for client: " + e.getMessage());
            }
        }

        @Override
        public void run() {
            try{
                String username = reader.readLine();
                System.out.println("User " + username + " joined.");
                chatServer.broadcastMessage("User " + username + " joined.", this);
                while(reader.readLine() != null){
                    String message = reader.readLine();
                    chatServer.broadcastMessage(message, this);
                }
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                clientHandlerList.remove(this);
            }
        }

        public void sendMessage(String message){
            writer.println(message);
        }
    }
}
