package exercises.sem2.LabTest.LabTest1;

import java.util.ArrayList;

public class Airlines {
    String airline_name;
    String flight_number;
    Account passenger;
    ArrayList<Account> cabin_crews;

    public Airlines(String airline_name, String flight_number, Account passenger) {
        this.airline_name = airline_name;
        this.flight_number = flight_number;
        this.passenger = passenger;
        cabin_crews = new ArrayList<>();
    }

    public void addCabinCrew (Account cabin_crew){
        cabin_crews.add(cabin_crew);
    }

    public int getNumberCabinCrew (){
        return cabin_crews.size();
    }

}
