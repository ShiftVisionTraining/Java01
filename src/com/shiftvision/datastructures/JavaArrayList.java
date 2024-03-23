package com.shiftvision.datastructures;

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {

        //ArrayList<Object> numbers = new ArrayList<Object>();
        //ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        List<Integer> numbers = new LinkedList<Integer>();
        //ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(7);
        //numbers.add(9);
        numbers.add(4,9);
        //numbers.add(4,"test");

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


        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.addAll(numbers);
        System.out.println("content [newNumbers]: " + newNumbers);

        Integer arrayNumber[] = {89,664,88};
        //List<Integer> arrayListNumber = Arrays.asList(arrayNumber);
        //System.out.println("content [arrayListNumber]: " + arrayListNumber);

        List<Integer> arrayListNumber = new ArrayList<>();
        for(int i = 0; i < arrayNumber.length; i++){
            arrayListNumber.add(arrayNumber[i]);
        }
        System.out.println("content [arrayListNumber]: " + arrayListNumber);

        List<Integer> xx = new ArrayList<>();
        List<Double> yy = new LinkedList<>();


        //numbers.clear();
        System.out.println("content [numbers]: " + numbers);

        List<Integer> removeList = new ArrayList<>();
        removeList.add(5);
        removeList.add(9);
        numbers.removeAll(removeList);
        System.out.println("content [numbers]: " + numbers);

        numbers.clear();
        System.out.println("isEmpty:" + numbers.isEmpty());

        System.out.println("content [arrayListNumber]: " + arrayListNumber);

        Integer myArray[] = new Integer[arrayListNumber.size()];
        //myArray = arrayListNumber.toArray(new Integer[0]);
        myArray = arrayListNumber.toArray(myArray);
        System.out.println("myArray:" + Arrays.toString(myArray));


        Iterator<Integer> iterator =  arrayListNumber.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
