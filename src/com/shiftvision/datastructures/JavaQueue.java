package com.shiftvision.datastructures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {

        // First in First out  -  FIFO

        Queue<String> queue = new LinkedList<>();
        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue: " + queue);

        for(String item: queue){
            System.out.println("Item:" + item);
        }
        System.out.println("Queue: " + queue);


        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(30);
        pq.offer(5);
        pq.add(30);
        System.out.println("PQ: " + pq);

        System.out.println("remove element: " + pq.remove());
        System.out.println("remove element: " + pq.remove());
        System.out.println("remove element: " + pq.remove());
        System.out.println("remove element: " + pq.remove());


        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Geeks");
        pq2.add("For");
        pq2.add("Geeks");

        System.out.println(pq2);
        System.out.println("remove element: " + pq2.remove());


        Queue<Integer> pq3 = new ArrayDeque<>();
        pq3.offer(2);
        pq3.offer(4);
//        pq3.offer(6);
//        pq3.offer(8);
//        pq3.offer(10);
//        pq3.offer(20);
//        pq3.offer(20);
        System.out.println(" pq3 content: " + pq3);
        System.out.println(" pq3 remove: " + pq3.remove());
        //System.out.println(" pq3 remove: " + pq3.poll());
        System.out.println(" pq3 remove: " + pq3.remove());
        System.out.println(" pq3 : " + pq3);
        //System.out.println(" pq3 remove: " + pq3.remove());
        System.out.println(" pq3 remove: " + pq3.poll());


    }
}
