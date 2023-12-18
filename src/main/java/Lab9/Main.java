package Lab9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        System.out.println(studentSystem.getStudentById(10));
    }
}
