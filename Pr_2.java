import java.util.*;

class Account {
    private int id;
    private double balance;  //balance for account
    private  double annualInterestRate;  //store the cuurent interest rate
    private java.util.Date dateCreated; //stores account created date.

    public Account() {
        dateCreated = new java.util.Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    //generate mutator(getter and setter) method
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public  double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public  void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void getAccountdetailes() {
        System.out.println("id : " + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("annualInterestRate : " + getAnnualInterestRate());
        System.out.println("Monthly interest is : " + getMonthlyInterest());
        System.out.println("This account was created at :  " + getDateCreated());
    }
}
class Pr_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id:");
        int id=sc.nextInt();
        System.out.println("Enter your balance:");
        double balance=sc.nextDouble();
        System.out.println("Enter your interest:");
        double interest=sc.nextDouble();
        System.out.println("Enter widraw amount:");
        double widrawamount=sc.nextDouble();
        System.out.println("Enter deposit amount:");
        double depositamount=sc.nextDouble();
        System.out.println("by 21ce008");
        Account a = new Account(id, balance);
        a.setAnnualInterestRate(interest);
        a.withdraw(widrawamount);
        a.deposit(depositamount);
        a.getAccountdetailes();
    }
}