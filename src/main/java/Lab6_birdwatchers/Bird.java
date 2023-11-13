package Lab6_birdwatchers;

import java.util.ArrayList;
import java.util.Scanner;

public class Bird {
    private ArrayList<String> birds;
    private String name;
    private String latinName;
    private Scanner scanner;
    private int observationsCount;
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.birds = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.observationsCount = 0;
    }

    public void add(){
        birds.add(name + " (" + latinName + ")");
    }

    public void observation(){
        observationsCount++;
    }

    public void statistics(){
        for(String bird:birds){
            System.out.println(name + " (" + latinName + ") :" + observationsCount);
        }
    }

    public void show(String name){
        System.out.println(name + " (" + latinName + ") :" + observationsCount);
    }

    public void quit(){
        System.exit(0);
    }

}
