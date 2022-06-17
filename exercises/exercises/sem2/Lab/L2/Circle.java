package exercises.sem2.Lab.L2;

public class Circle implements Comparable {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    @Override
    public int compareTo(Object o) {
        if (this.radius>((Circle)o).radius){
            return 1;
        }else if (this.radius==((Circle)o).radius){
            return 0;
        }else {
            return -1;
        }
    }
}
