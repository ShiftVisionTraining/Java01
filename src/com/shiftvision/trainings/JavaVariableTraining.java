package com.shiftvision.trainings;

public class JavaVariableTraining {
    public static Byte bigByte = null;
    public static void variableTraining(){
        byte myAge;
        myAge = 110;
        System.out.print("My age is: ");
        System.out.println(myAge);
        byte yourAge = 24;
        Byte bigByte = null;
        JavaVariableTraining.bigByte = 55;

        short aShortVar = 23456;
        Short bigShort = 3345;

        int aIntVar = 763671237;
        Integer bigInt = 445566;

        long aLongVar = 636366737L;
        Long bigLong = 5657755L;

        float aFloatVar = 1.2f;
        Float bigFloat = 1.3f;

        double aDoubleVar = 1.3333333;
        Double bigBouble = 2.445667;

        long myNumber = aIntVar * aLongVar;
        System.out.println("MyNumber:" + myNumber);

        boolean aBooleanVar = true;
        Boolean bigBoolean = false;

        char aCharVar = 'A';
        Character bigChar = 'A';

        String myName = "Iftekhar";

        System.out.println("MyName is: " + myName);

        String text = "Hello";
        String bank = " ";
        String name = "Ivaan";
        String greeting = text + bank + name;
        System.out.println(greeting);

        System.out.println("Hello " + " " + " Ivaan");
        System.out.println("Hello " + bigBouble + " Ivaan");
    }

}
