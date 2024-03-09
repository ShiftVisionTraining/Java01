package com.shiftvision.trainings;

import java.util.Scanner;

public class JavaWhileLoopTraining {

    public static void whileLoopTraining(){

//        int i = 1;
//        while( i <= 5){
//            System.out.println("Running.." + i);
//            i++;
//        }

//        int sum = 0;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter a number:");
//        int number = input.nextInt();
//
//        while(number > 0){
//            sum += number;
//
//            System.out.println("Please enter a number [0 or negative number to exit]:");
//            number = input.nextInt();
//        }
//
//        System.out.println("Sum: " + sum);
//        input.close();

        Scanner input = new Scanner(System.in);
        int number = 0;

        while (true){
            System.out.println("Please enter a number:");
            number = input.nextInt();
            if( number <= 0){
                break;
            }
            System.out.println("You have enter a valid number : " + number);
        }

        input.close();
    }
}
