package Lab9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {

    List<Student> students;

    public StudentSystem(String fileName){
        students = new ArrayList<>();
        try{
            students = readStudents(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> readStudents(String fileName) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for(String line : lines){
            String[] parsedLine = line.split(",");
            Student tempStudent = new Student(
                    Integer.parseInt(parsedLine[0]), parsedLine[1], parsedLine[2], parsedLine[3], Double.parseDouble(parsedLine[4]));

            students.add(tempStudent);
        }
        bufferedReader.close();
        return students;
    }

    public void readWholeStudentList(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for(String line : lines){
            System.out.println(line);
        }
        bufferedReader.close();
    }

    public Optional<Student> getStudentById(int id){
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }

}

/*
    public static List<Student> readStudents(String fileName) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(fileName)
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for(String line : lines){
            String[] parsedLine = line.split(",");
            Student tempStudent = new Student(
                    Integer.parseInt(parsedLine[0]), parsedLine[1], parsedLine[2], parsedLine[3], Double.parseDouble(parsedLine[4]));
            students.add(tempStudent);
        }
        bufferedReader.close();
        return students;
    }
    */
