package com.shiftvision.oop;

public class CheckingAccount extends Account{

    public CheckingAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("CheckingAccount  class getting init...");
    }

    @Override
    public double getFine() {
        return 0;
    }

}
