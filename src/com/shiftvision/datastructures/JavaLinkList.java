package com.shiftvision.datastructures;

import java.util.*;

public class JavaLinkList {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<Integer>();
        //LinkedList<Integer> numbers = new LinkedList();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("length [numbers]: " + numbers.size());
        System.out.println("content [numbers]: " + numbers);

        numbers.add(11);
        System.out.println("length [numbers]: " + numbers.size());
        System.out.println("content [numbers]: " + numbers);

        for (int i = 0; i < numbers.size(); i++){
            System.out.println("In index [" + i + "] :" + numbers.get(i));
        }

        for(Integer x : numbers ){
            System.out.println("content: " + x);
        }

        numbers.remove(5);
        System.out.println("content [numbers]: " + numbers);

        //Integer x = 7;
        //numbers.remove(x);
        //numbers.remove((Integer)7);
        //System.out.println("content [numbers]: " + numbers);

        Boolean containes7 = numbers.contains((Integer)7);
        System.out.println("Do we have 7:" + containes7);

        while(numbers.contains((Integer)7)){
            numbers.remove((Integer)7);
        }
        System.out.println("content [numbers]: " + numbers);

        Iterator<Integer> iterator =  numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        numbers.clear();
        System.out.println("isEmpty:" + numbers.isEmpty());




    }
}
