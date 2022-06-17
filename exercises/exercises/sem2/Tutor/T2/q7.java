package exercises.sem2.Tutor.T2;

import java.util.ArrayList;

public class q7 {
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        vehicle.add("lesgo");
        vehicle.add("lesgo");
        vehicle.add("lesgo");

        transportation.add("mader");
        transportation.add("LEGOAT JAMES WUZ ERE");
        transportation.add("mader");

        allTransportation(vehicle,transportation);
    }

    public static <T> void allTransportation(ArrayList<?> a, ArrayList<?> b){
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
