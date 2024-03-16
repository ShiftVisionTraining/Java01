package com.shiftvision.oop;

public class SavingPlusPlusAccount extends SavingAccount{

    public SavingPlusPlusAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("SavingPlusAccount class getting init...");
    }

    @Override
    public double getFine() {
        return 20.00;
    }


}
