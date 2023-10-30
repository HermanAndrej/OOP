package people;

public class Circle extends Shape{

    private double radius;
    public Circle(String color, double radius, FillType filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override public void displayInfo(){
        System.out.println("The circle is " + getColor() + " and it is " + getFilled() + " and it's area is " + getArea());
    }

    @Override public double getArea() {
        return radius*radius*3.14;
    }

    public double calculateCircumfence(double PI, double radius){
        return 2*PI*radius;
    }

    public double calculateCircumfence(double radius){
        return 2*Math.PI*radius;
    }
}
