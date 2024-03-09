package com.shiftvision.trainings;

import java.util.Scanner;

public class JavaDoWhileLoopTraining {

    public static void doWhileLoop(){
        int i = 6;
        int n = 5;

/*        do{
            System.out.println(i);
            i++;
        } while (i <= n);*/

        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);
        do{
            sum += number;
            System.out.println("Enter a number?");
            number = input.nextInt();
        } while (number >= 0);

        System.out.println("Sum: " + sum);
        input.close();




    }
}
