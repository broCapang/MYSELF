package exercises.sem2.LabTest.LabTest1;

public class Airport {
    public static void main(String[] args) {
        Flight f1 = new Flight("Singapore Airlines","SG804",new Account("1201","Khairul","khairul@gmail.com","012-9787765"),new Item("Business",9032),new Item("Chicken Satay",25));
        f1.addCabinCrew(new Account("Sue"));
        f1.addCabinCrew(new Account("Daniel"));
        f1.addCabinCrew(new Account("Lily"));

    }
}
