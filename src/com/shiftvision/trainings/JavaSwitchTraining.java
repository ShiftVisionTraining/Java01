package com.shiftvision.trainings;

import java.util.Scanner;

public class JavaSwitchTraining {


    public static void switchTraining(){

        String month;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter birth month:");
        month = input.next();

        switch (month){
            case "jan":
                System.out.println("Your birth month is Jan");
                break;
            case "feb":
                System.out.println("Your birth month is Feb");
                break;

            default:
                System.out.println("You did not enter the month");
        }

        input.close();
    }
}
