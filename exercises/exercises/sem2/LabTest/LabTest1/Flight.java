package exercises.sem2.LabTest.LabTest1;

public class Flight extends Airlines implements Comparable<Airlines>{
    Item flight, meal;

    public Flight(String airline_name, String flight_number, Account passenger, Item flight, Item meal) {
        super(airline_name, flight_number, passenger);
        this.flight = flight;
        this.meal = meal;
    }

    @Override
    public int compareTo(Airlines o) {
        if (this.getNumberCabinCrew()>o.getNumberCabinCrew()){
            return 1;
        }else if (this.getNumberCabinCrew()<o.getNumberCabinCrew()){
            return -1;
        }
        return 0;
    }
}
