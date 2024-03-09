package com.shiftvision.trainings;

import java.util.Arrays;

public class JavaArrayTraining {

    public static void arrayTraining(){
        System.out.println("JavaArrayTraining...");

        int value1 = 7;
        int value2 = 10;
        int value3 = 6;
        int value4 = 8;

        int[] values ;
        values = new int[4];

        //Integer x = 55;
        String x = "test";
        values[0] = 7;
        values[1] = 6;
        values[2] = 74;
        values[3] = 57;
        //values[3] = x;
        //values[4] = 5;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        //System.out.println(values);
        System.out.println(Arrays.toString(values));

        System.out.print("[");
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            System.out.print(", ");
        }
        System.out.println("]");


        System.out.println("Array values length: " + values.length );
//        for (int i = 0; i < values.length; i++) {
//            System.out.println(values[i]);
//        }




        values = new int[10];
        values[4] = 5;
        System.out.println(values[3]);
        System.out.println(values[4]);

        char[] myChars = {'A', 'B', 'C', 'D'};
        System.out.println(myChars[0]);
        System.out.println(myChars[3]);

        String[][] cells = new String[5][6];
        cells[0][0] = "A1";
        cells[1][0] = "B1";
        cells[2][0] = "C1";
        cells[3][0] = "D1";
        cells[4][0] = "E1";

        cells[0][1] = "A2";
        cells[1][1] = "B2";
        cells[2][1] = "C2";
        cells[3][1] = "D2";
        cells[4][1] = "E2";

        System.out.println(Arrays.toString(cells));
        System.out.println(Arrays.deepToString(cells));

        System.out.println("Array cells length:" + cells.length);
        System.out.println("Array cells[0] length:" + cells[0].length);

        String[][][] test = new String[5][5][5];
        test[1][1][1] = "test1";

        System.out.println(Arrays.deepToString(test));



    }
}
