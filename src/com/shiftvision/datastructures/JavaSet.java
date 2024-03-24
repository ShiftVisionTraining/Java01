package com.shiftvision.datastructures;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {

    public static void main(String[] args) {
        Set<Integer> mySet1 = new HashSet<Integer>();
        mySet1.add(1);
        mySet1.add(2);
        mySet1.add(1);
        mySet1.add(4);
        mySet1.add(1);
        mySet1.add(15);
        mySet1.add(1);

        System.out.println("Content: " + mySet1);




    }
}
