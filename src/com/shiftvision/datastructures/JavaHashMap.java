package com.shiftvision.datastructures;

import java.sql.SQLOutput;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class JavaHashMap {
    public static void main(String[] args) {
        //Hashtable<String,String> ht = new Hashtable<>();
        HashMap<String,String> ht = new HashMap<>();

        ht.put("ONE", "Iftekhar");
        ht.put("TWO", "Ameera");
        ht.put("THREE", "Simrohn");
        ht.put(null,"Shehla");
        System.out.println("Content: " + ht);

        String item = ht.get("TWO");
        System.out.println("Item: " + item);

        ht.remove("TWO");
        System.out.println("Content: " + ht);

        System.out.println(ht.size());


        System.out.println(ht.containsKey("THREE"));

        Set<String> keys =  ht.keySet();
        for(String key : keys){
            System.out.println(ht.get(key));
        }

//        Enumeration<String> enumeration =  ht.keys();
//        while (enumeration.hasMoreElements()){
//            String key = enumeration.nextElement();
//            System.out.println(ht.get(key));
//        }

        ht.clear();

    }
}
