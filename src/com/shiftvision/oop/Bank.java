package com.shiftvision.oop;

public interface Bank {
    public void deposit(double amount);
    public double getBalance();

    default void print(){
        System.out.println(toString());
    }
}
