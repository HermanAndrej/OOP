package Lab9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {
    List<Student> students;

    public StudentSystem(String fileName) throws IOException {
        students = readStudents(fileName);
        if(students.isEmpty()){
            throw new EmptyStudentListException("List is empty!");
        }
    }

    public List<Student> readStudents(String fileName){
        List<Student> students = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(fileName)
            );
            List<String> lines = bufferedReader.lines().toList();
            for(String line : lines){
                String[] part = line.split(",");
                Student student = new Student(
                        Integer.parseInt(part[0]), part[1], part[2], part[3], Double.parseDouble(part[4]));
                students.add(student);
            }
            bufferedReader.close();
        } catch (IOException e){}
        return students;
    }

    public Optional<Student> getStudentById(int id){
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();

    }

    public Student getHighestGpaStudent(){
        if(students.isEmpty()){
            throw new EmptyStudentListException("List is empty!");
        }
        Student temp = students.get(0);
        for(Student student : students){
            if(student.getGpa() > temp.getGpa()){
                temp = student;
            }
        }
        return temp;
    }

    public Student getLongestNameStudent(){
        if(students.isEmpty()){
            throw new EmptyStudentListException("List is empty!");
        }
        Student temp = students.get(0);
        for(Student student : students){
            if(student.getName().length() > temp.getName().length()){
                temp = student;
            }
        }
        return temp;
    }
}
