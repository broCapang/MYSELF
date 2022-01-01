package exercises.tutorial8;

public class Main {
    public static void main(String[] args) {

        Coordinate bruh = new Coordinate();
        Coordinate bruh2 = new Coordinate(12,15);

        System.out.println(bruh.output());
        bruh2.setCoordinateX(20);
        System.out.println(bruh2.output());
    }


}
