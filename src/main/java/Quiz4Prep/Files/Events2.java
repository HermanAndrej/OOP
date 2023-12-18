package Quiz4Prep.Files;

import java.io.*;

public class Events2 {
    static String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};

    public static void generateEventsFile(String fileName, int numOfRecords) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(fileName)
        );
        for(int i = 0; i<numOfRecords; i++){
            bufferedWriter.write(eventTypes[0] + "\n");
        }
        bufferedWriter.close();
    }

    public static void readEventsFile(String fileName){
        try{
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(fileName)
            );
            String tempLine;
            while((tempLine = bufferedReader.readLine()) != null){
                for(int i = 0; i < 5; i++){
                    System.out.println(tempLine);
                }
            }
            bufferedReader.close();
        } catch (IOException e){
            System.out.println("Error");
        }

    }

    public static void main(String[] args) throws IOException{
        generateEventsFile("events2.txt", 4);
        readEventsFile("events2.txt");
    }
}
