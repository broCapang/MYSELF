package exercises.sem1.lab9;

public class Rectangle extends Shape{
    private double side1, side2;

    public void setRectangle(String name, double perimeter, double area, double side1, double side2){
        super.setShape(name,perimeter,area);
        this.side1=side1;
        this.side2=side2;

    }

    public double getPerimeter(double side1, double side2){
        return side1*2.0+side2*2.0;
    }

    public double getArea(double side1, double side2){
        return side1*side2;
    }

}
