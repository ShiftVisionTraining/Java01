package com.shiftvision.trainings;

public class JavaIfElseTraining {

    public static void ifElseTraining(){

        int num1 = 9;
        int num2 = 10;

        if(num1 < num2){
            System.out.println("My number is less then 10");
            num1 += 2;
            System.out.println(num1);
        }


        if(num1 < 10){
            System.out.println("My number is less then 10");
            num1 += 2;
            System.out.println(num1);

        }
        else {
            System.out.println("My number is greater or equal then 10");
        }

        if( num1 == 11){
            System.out.println("Num1 is equal to 11");
        }

        num1 = 20;
        if( num1 >=  20){
            System.out.println("Mu number is more the 20");
        }

        if( num1 != 30){
            System.out.println("My number is not equal to 30");
        }


        int x = 5;
        int y = 10;
        int z  = 20;

        if( (x >= 5) && (y <= 10) ){
            System.out.println("Mu number is more then or equal to 5 and less then or equal to 10");
        }

        if( ((x > 5) || (y == 10)) && z == 20 ){
            System.out.println("I want to print it");
        }

        /*
            And Truth Table
            T && T = T
            T && F = F
            F && T = F
            F && F = F

            OR Truth Table

            T || T = T
            T || F = T
            F || T = T
            F || F = F
         */


        if( x >= 5){

            System.out.println("I am inside if statement");


            if(y == 10){
                System.out.println("x is 5 and y is 10");
            }
            else {
                System.out.println("x is 5 but y is not 10");
            }
            System.out.println("*******");
        }


        if( !(x == 5)){
            System.out.println("x is 5");
        }


    }
}
