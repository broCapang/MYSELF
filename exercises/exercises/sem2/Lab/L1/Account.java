package exercises.sem2.Lab.L1;

import java.util.Date;

public class Account {
    private int id;
    private double balance, annualInterestRate;
    private static Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated=new Date();
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

    public static Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12.0;
    }

    public double getMonthlyInterest(){
        return this.balance*getMonthlyInterestRate();
    }


}
