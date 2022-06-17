package exercises.sem1.tutorial8;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(){
        x=0;
        y=0;
    }
    public Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getCoordinateX(){
        return x;
    }
    public int getCoordinateY(){
        return y;
    }
    public void setCoordinateX(int x){
        this.x=x;
    }
    public void setCoordinateY(int y){
        this.y=y;
    }
    public String output(){
        return "X: "+x+"\nY: "+y;
    }

}
