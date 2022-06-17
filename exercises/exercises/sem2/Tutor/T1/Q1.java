package exercises.sem2.Tutor.T1;

public class Q1 {
    public static void main(String[] args) {
        Telephone a = new Telephone("03","79676300");
        Telephone b = new Telephone("03","79676301");
        Telephone c = new Telephone("03","79676302");
        Telephone d = new Telephone("03","79676303");
        Telephone e = new Telephone("03","79676304");

        System.out.println(a.makeFullNumber());
        System.out.println(b.makeFullNumber());
        System.out.println(c.makeFullNumber());
        System.out.println(d.makeFullNumber());
        System.out.println(e.makeFullNumber());
        System.out.println(Telephone.getNumberOfTelObj());
    }


}
