package org.example.CollectionFrameWorks;

import java.util.ArrayList;

public class LearnLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("Peddi(RC)");
        list.add("Dookudu(Bob)");
        list.add("Sarrainodu(bhAAi)");
        list.add("Jersey");
        list.add("TholiPrema");
        list.add("Radheshyam");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.set(4,"Devara");
        System.out.println(list);
        System.out.println(list.contains("Jersey"));

    }

}
