package org.example.CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
public class MyHashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map);

        for(String key : map.keySet()){//Has only keys and it searches the values in the bucket and prints
            System.out.println(key+" : "+map.get(key));
        }

        for(Map.Entry<String,Integer> entry : map.entrySet()){//Has both keys and values by default
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println(map.putIfAbsent("E",5));
        for(Map.Entry<String,Integer> entry : map.entrySet()){//Has both keys and values by default
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(map.putIfAbsent("A",5));
    }
}
