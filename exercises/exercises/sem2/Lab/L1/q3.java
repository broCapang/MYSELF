package exercises.sem2.Lab.L1;

public class q3 {
    public static void main(String[] args) {
        Account a = new Account(1122,20000);
        a.setAnnualInterestRate(0.045);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getDateCreated());
    }
}
