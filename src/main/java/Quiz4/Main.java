package Quiz4;
public class Main {
    public static void main(String[] args) {

            String filename = "data.txt";

            Student student = new Student();

            student.setFirstName("Jane");

            student.setLastName("Doe");

            student.setAge(20);

            Parser.saveConfigurableFields(filename, student);

            Parser.saveConfigurableFields(filename, student);

    }

}
