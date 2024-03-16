package com.shiftvision.oop;

public class SavingAccount extends Account{

    public SavingAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("SavingAccount class getting init...");
    }

    @Override
    public double getFine() {
        return 2.00;
    }


}
