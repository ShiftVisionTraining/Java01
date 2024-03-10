package com.shiftvision.oop;

public class SavingAccount extends Account{

    public SavingAccount(String accountNumber, String accountName){
        super(accountNumber,accountName);
        System.out.println("SavingAccount class getting init...");
    }

    @Override
    public void withdraw(double amount) {
        if( amount > 0){
            balance -= amount;
            balance -= FINE;
        } else{
            throw new RuntimeException("Withdraw amount can not be less then 0");
        }
    }


}
