package com.shiftvision.oop;

public abstract class Account implements ATM, Bank {
    private String accountNumber;
    private String accountName;
    protected double balance;
    private double interestRate = 0;


    private Account(){
        System.out.println("Account class getting init...");
    }
    public Account(String accountNumber, String accountName){
        this();
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if( amount > 0){
            balance += amount;
        } else{
            throw new RuntimeException("Deposit amount can not be less then 0");
        }
    }

    public  void withdraw(double amount){
        if( amount > 0 && amount <= this.balance){
            balance -= amount;
            balance -= getFine();
            System.out.println("Withdraw Amount: " + amount);
        } else{
            throw new RuntimeException("Withdraw amount can not be less then 0 or more then balance");
        }
    }
    public  void withdraw(double amount, String message) {
        this.withdraw(amount);

        System.out.println("Withdraw Message: " + message);
    }


    public abstract double getFine();

//    public  double getFine(){
//        return 0;
//    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
