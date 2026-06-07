package org.example.CollectionFrameWorks;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        System.out.println(hs);
        hs.remove("D");
        System.out.println(hs);
        System.out.println(hs.contains("D"));
        System.out.println(hs);
        System.out.println(hs);
        System.out.println(hs);

        ls.add("A");
        ls.add("B");
        ls.add("C");
        ls.add("D");
        ls.add("E");
        System.out.println(ls);

    }
}
