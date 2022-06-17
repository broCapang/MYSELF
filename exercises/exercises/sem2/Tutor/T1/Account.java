
package exercises.sem2.Tutor.T1;

import java.util.Date;


public class Account {
    
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        double rate = annualInterestRate/100;
        this.annualInterestRate = rate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        double z = annualInterestRate/12;
        return z;
    }
    
    public double getMonthlyInterest(){
        double a = balance * getMonthlyInterestRate();
        return a;
    }
    
    public void withdraw(int b){
        balance = balance - b;
    }
    
    public void deposit(int c){
        balance = balance + c;
    }
}
