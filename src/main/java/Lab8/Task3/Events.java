package Lab8.Task3;

import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Events {
    private String[] eventType = {"Login", "Logout", "Purchase", "ViewPage", "Error"};

    public void generateEventsFile(String fileName, int numOfRecords) throws IOException {
        Random random = new Random();
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(fileName)
        );
        for(int i = 0; i < numOfRecords; i++){
            bufferedWriter.write("\n Time: " + random.nextInt(24) + ":" + random.nextInt(60) + ":"
            + random.nextInt(60) + " (" + eventType[random.nextInt(eventType.length)] + ") ID: " + random.nextInt(1000));
        }
        bufferedWriter.close();
    }

    public void readWholeFileList(String fileName) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for (String line : lines)
            System.out.println(line);

        bufferedReader.close();
    }


    public static void main(String[] args) throws IOException {
        Events events = new Events();
        try {
            events.generateEventsFile("events.txt", 1000000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            events.readWholeFileList("events.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
