package Lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try {
            // Check if command-line arguments include a username and server IP
            if (args.length < 2) {
                System.out.println("Usage: java ChatClient <username> <server-ip>");
                System.exit(1);
            }

            // Retrieve the username and server IP from command-line arguments
            String username = args[0];
            String serverIP = args[1];

            // Set the server port to a desired port number
            int serverPort = 12345; // Replace 12345 with the desired port number

            // Create a Socket object by connecting to the specified server IP and port
            Socket socket = new Socket(serverIP, serverPort);

            // Initialize a BufferedReader to read messages from the server
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Initialize a PrintWriter to send messages to the server
            PrintWriter serverWriter = new PrintWriter(socket.getOutputStream(), true);

            // Use the writer to send the username to the server
            serverWriter.println(username);

            // Start a new thread to continuously receive messages from the server
            new Thread(() -> {
                try {
                    // Inside the thread, create a loop to read messages from the server and print them to the console
                    String serverMessage;
                    while ((serverMessage = serverReader.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace(); // Handle IOExceptions by printing the stack trace
                }
            }).start();

            // Outside the thread, create a loop to read messages from the console and send them to the server using the writer
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String clientMessage;
            while ((clientMessage = consoleReader.readLine()) != null) {
                serverWriter.println(clientMessage);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Handle IOExceptions by printing the stack trace
        }
    }
}
