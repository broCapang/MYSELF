package exercises.sem2.Lab.L1;

import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private String name;
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account1() {
        this.name = "";
        this.id = 0;
        this.balance = 0;
        dateCreated=new Date();
    }

    public Account1(String name, int id, double balance) {
        this.name = name;
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

    public Date getDateCreated() {
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
    public void withdraw(double amount, String description){
        transactions.add(new Transaction('W',amount,balance,description));
    }
    public void deposit(double amount,String description){
        transactions.add(new Transaction('D',amount,balance,description));
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12.0;
    }

    public double getMonthlyInterest(){
        return this.balance*getMonthlyInterestRate();
    }

    @Override
    public String toString() {
        return "Account1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", transactions=" + transactions.toString() +
                '}';
    }
}
