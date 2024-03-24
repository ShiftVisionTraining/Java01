package com.shiftvision.datastructures;

import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {

        //Last in First out  - LIFO

        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(9);
        myStack.push(11);
        myStack.push(3);
        myStack.push(4);
        myStack.push(20);

        System.out.println("myStack Size " + myStack.size());
        System.out.println("myStack Content " + myStack);

        int nextItemPeek  = myStack.peek();
        System.out.println("Next item: " + nextItemPeek);
        System.out.println("myStack Size " + myStack.size());
        System.out.println("myStack Content " + myStack);

        int nextItem  = myStack.pop();
        System.out.println("Next item: " + nextItem);
        System.out.println("myStack Size " + myStack.size());
        System.out.println("myStack Content " + myStack);

        int index =  myStack.indexOf((Integer)11);
        System.out.println("index:" + index);

        myStack.remove(1);
        System.out.println("myStack Content " + myStack);

        myStack.clear();
        System.out.println("myStack Size " + myStack.size());

        System.out.println("isEmpty:" + myStack.isEmpty());
//        nextItem  = myStack.pop();
//        nextItem  = myStack.pop();
//        nextItem  = myStack.pop();
//        System.out.println("Next item: " + nextItem);
//        System.out.println("myStack Size " + myStack.size());
//        System.out.println("myStack Content " + myStack);

    }

}
