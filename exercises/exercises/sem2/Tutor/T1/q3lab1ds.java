
package exercises.sem2.Tutor.T1;


public class q3lab1ds {


    public static void main(String[] args) {
        
        Account leham = new Account(1122,20000);
        leham.setAnnualInterestRate(4.5);
        leham.withdraw(2500);
        leham.deposit(3000);
        System.out.println("$" + leham.getBalance());
        System.out.println(leham.getMonthlyInterest());
    }
    
}
