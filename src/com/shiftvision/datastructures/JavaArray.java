package com.shiftvision.datastructures;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        int numbers[] = {1,3,5,7,9};
        System.out.println("Length [numbers]: " + numbers.length);
        System.out.println("content [numbers]: " + Arrays.toString(numbers));
        //numbers[5] = 11;

//        int tmp[] = new int[6];
//        System.out.println("Length [tmp]: " + tmp.length);
//        System.out.println("content [tmp]: " + Arrays.toString(tmp));
//
//        for(int i = 0; i < numbers.length; i++){
//            tmp[i] = numbers[i];
//        }

        int[] tmp = Arrays.copyOf(numbers, 6);

        System.out.println("Length [tmp]: " + tmp.length);
        System.out.println("content [tmp]: " + Arrays.toString(tmp));

        numbers = tmp;
        System.out.println("Length [numbers]: " + numbers.length);
        System.out.println("content [numbers]: " + Arrays.toString(numbers));

        numbers[5] = 11;
        System.out.println("Length [numbers]: " + numbers.length);
        System.out.println("content [numbers]: " + Arrays.toString(numbers));

    }

}
