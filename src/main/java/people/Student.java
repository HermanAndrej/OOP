package people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credits = 0;
    private int student_id;
    private List<Integer> grades;

    public Student(String name, String address) {
        super(name, address);
    }
    public void study(){
        credits++;
    }

    public void addGrade(int grade){
        if(grade <= 5 || grade >= 1){
            grades.add(grade);
        }else{
            System.out.println("Invalid grade input!");
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + credits;
    }
}
