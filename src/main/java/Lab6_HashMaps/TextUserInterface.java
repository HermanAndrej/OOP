package Lab6_HashMaps;

import java.util.Scanner;

public class TextUserInterface{
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Statements:");
        System.out.println("   add - adds a word pair in dictionary");
        System.out.println("   translate - asks for a word and prints its translation");
        System.out.println("   quit - quit the text user interface");
        System.out.println();
        System.out.println("Statement: ");
        while (true) {
            String statement = reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }else if(statement.equals("add")){
                System.out.println("In Finnish: ");
                String key = reader.nextLine();
                System.out.println("Translation: ");
                String value = reader.nextLine();

                dictionary.add(key, value);
            }else if(statement.equals("translate")){
                System.out.println("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.getHashMap().get(word));
            }
            else {
                System.out.println("Unknown statement!");
            }
        }
    }
}
