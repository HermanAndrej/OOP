package Lab9;

import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentSystem studentSystem = new StudentSystem("students.csv");
        try {
            Optional<Student> student = studentSystem.getStudentById(10);
            System.out.println(student.orElseThrow(() -> new StudentNotFoundException("Student not found")));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(studentSystem.getHighestGpaStudent());
        System.out.println(studentSystem.getLongestNameStudent());
    }
}