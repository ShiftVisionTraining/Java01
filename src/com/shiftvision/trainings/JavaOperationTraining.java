package com.shiftvision.trainings;

public class JavaOperationTraining {

    public static void operation(){
        int num1 = 10;
        int num2 = 25;
        int num3 = -30;

        int sum;
        sum = num1 + num2;
        System.out.println("sum: " + sum);
        System.out.println("Sub: " + (num2 - num1));

        int pro = num1 * num2;
        System.out.println("mul: " + pro);;

        int x = num2 / num1;
        System.out.println("X: " + x);

        //int x = num2 / num1;
        System.out.println("X: " + ( num2 / 10.0));

        int y = num2 % num1; // Modulo Operation [Remainder after division]
        System.out.println("Y: " + y);;


        int divNum = num2 / num1;
        System.out.println("divNum: " + divNum);

        float floatingNumber1 = num2 / num1;
        System.out.println("floatingNumber1: " + floatingNumber1);

        float floatingNumber2 = (float)num2 / num1;
        System.out.println("floatingNumber2: " + floatingNumber2);

        var floatingNumber3 = num2 / (float)num1;
        System.out.println("floatingNumber3: " + floatingNumber3);

        int x1 = 5;

        //x1 = x1 + 2;
        x1 += 2;
        System.out.println("X1:" + x1);

       // x1 = x1 - 2;
        x1 -= 2;
        System.out.println("X1:" + x1);

        x1 *= 2;
        System.out.println("X1:" + x1);

        x1 /= 2;
        System.out.println("X1:" + x1);

        x1 %= 2;
        System.out.println("X1:" + x1);

        int myNum = 5;
        //myNum = myNum + 1;
        ++myNum;
        System.out.println("myNum:" + myNum);

        --myNum;
        System.out.println("myNum:" + myNum);


        //var myVar = ((2 + 3) / 2);
        var myVar = (2 + 3 / 2);
        System.out.println("myVar:" + myVar);

        var exp = Math.pow(2,5);
        System.out.println("exp:" + exp);


    }
}
