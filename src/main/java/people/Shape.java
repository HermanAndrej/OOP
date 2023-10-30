package people;

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled){
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo(){
        System.out.println("The shape is " + color + " and it is " + filled);
    }

    public String getColor(){
        return this.color;
    }

    public FillType getFilled(){
        return this.filled;
    }

    public double getArea(){
        return 0.0;
    }

}
