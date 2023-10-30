package people;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override public void displayInfo(){
        System.out.println("The rectangle is " + width + " wide and " + height + " tall and is " + getColor() + "and it is " + getFilled() + " and it's area is " + getArea());
    }

    @Override public double getArea(){
        return width*height;
    }
}
