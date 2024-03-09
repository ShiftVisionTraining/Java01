package com.shiftvision.trainings;

public class JavaForLoopTraining {

    public static void javaForLoop(){

        int x = 5;

        int myNum[] = {3, 5, 7, 8, 9,1};


        for ( int i = 0 ; i <= 5  ; ++i) {
            System.out.println("I am running " + i);
        }

        for ( int i = 9 ; i >= 0  ; --i) {
            System.out.println("I am running " + i);
        }


        for ( int i = 0 ; i < myNum.length  ; ++i) {
            System.out.println("I am running [" + i + "]: " + myNum[i]);
        }

//        int i = 0;
//        for (  ;  ; ) {
//            System.out.println("I am running " + i);
//            ++i;
//
//            if (!(i <= 5 )){
//                System.out.println("break");
//                break;
//            }
//        }


        for(int n : myNum){
            System.out.println("MyArray Item: " + n);
        }

        int r = 5;
        int c = 5;

        for(int i = 0; i < r; i++){
            System.out.println("Processing row " + i);
            for(int j = 0; j < c; j++){
                System.out.println("Processing col " + j);
                System.out.println("Cell[" + i + " , " + j + "]");
//                if( j == 2){
//                    break;
//                }
            }
        }




    }
}
