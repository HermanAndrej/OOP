package Quiz4Prep.Reflections;

public class GradeAnalyzer {
    private int[] grades;
    public GradeAnalyzer(int[] grades){
        this.grades = grades;
    }

    public double calculateAverageGrade(){
        double sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum/grades.length;
    }

    public void printGradeSummary(){
        for(int grade : this.grades){
            System.out.println(grade);
        }
    }

}
