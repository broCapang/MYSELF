package exercises.sem2.Lab.L1;

public class q4 {
    public static void main(String[] args) {
        Account1 a = new Account1("George",1122,1000);
        a.setAnnualInterestRate(0.015);
        a.deposit(30,"ur mom");
        a.deposit(40,"ur mom2");
        a.deposit(50,"ur mom3");
        a.withdraw(5,"ur dad");
        a.withdraw(4,"ur dad2");
        a.withdraw(3,"ur dad3");

        System.out.println(a.toString());

    }
}
