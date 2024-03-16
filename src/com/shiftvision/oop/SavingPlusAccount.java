package com.shiftvision.oop;

public final class SavingPlusAccount extends SavingAccount{

    public SavingPlusAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("SavingPlusAccount class getting init...");
    }

    @Override
    public double getFine() {
        return 10.00;
    }


}
