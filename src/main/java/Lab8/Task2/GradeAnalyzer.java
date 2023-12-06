package Lab8.Task2;

import java.util.List;

public class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAvgGrade(){
        double sum = 0;
        for(int grade: grades){
            sum = sum + grade;
        }
        return sum/grades.size();
    }

    public void printSummary(){
        System.out.println("Average grade is: " + calculateAvgGrade());
    }
}
