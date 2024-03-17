package com.shiftvision.oop;

public interface ATM {
      void withdraw(double amount);
      void withdraw(double amount, String message);
      default void getPin(String pin){
            System.out.println("You have entered pin:" + pin);
      }
}
