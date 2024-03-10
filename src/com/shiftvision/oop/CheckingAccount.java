package com.shiftvision.oop;

public class CheckingAccount extends Account{

    public CheckingAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("CheckingAccount  class getting init...");
    }

    @Override
    public void withdraw(double amount) {
        if( amount > 0){
            balance -= amount;
        } else{
            throw new RuntimeException("Withdraw amount can not be less then 0");
        }
    }

}
