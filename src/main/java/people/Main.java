package people;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }
        System.out.println( olli );

        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );


        printDepartment(people);

        Shape shape1 = new Shape("red", FillType.FILLED);
        Circle circle1 = new Circle("blue", 8, FillType.NOT_FILLED);
        Rectangle rectangle1 = new Rectangle("Green", FillType.NOT_FILLED, 7, 9);

        shape1.displayInfo();
        circle1.displayInfo();
        rectangle1.displayInfo();

    }
    public static void printDepartment(List<Person> people) {
        for(Person person : people){
            System.out.println(person);
        }
    }


}
