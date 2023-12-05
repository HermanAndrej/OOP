package Lab8.Task2;

import java.util.List;

public class Student {
    private String name;
    private int id;
    private List grades;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setName(int id){
        this.id = id;
    }

    public void printInfo(){
        System.out.println(id + ": " + name);
    }

}
