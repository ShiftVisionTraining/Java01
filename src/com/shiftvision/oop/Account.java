package com.shiftvision.oop;

public abstract class Account {
    private String accountNumber;
    private String accountName;
    protected double balance;
    private double interestRate = 0;

    protected final double FINE = 2.0;

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

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public String getAccountName() {
        return accountName;
    }

//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }

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

    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", FINE=" + FINE +
                '}';
    }
}
