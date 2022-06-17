package exercises.sem1.lab9;

public class Shape {
    private String name;
    private double perimeter,area;

    public void setShape(String name, double perimeter, double area){
        this.name=name;
        this.perimeter=perimeter;
        this.area=area;
    }

    public String getName() {
        return name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        String p = String.format("\nperimeter = %.2f",this.perimeter);
        String a = String.format("\narea = %.2f",this.area);
        return "Shape{" +
                "\nname='" + name +
                p +
                a +
                '}';
    }
}
