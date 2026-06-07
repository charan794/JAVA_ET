package org.example.Day03;

public class maxString {
    static void main(String[] args) {
        String str="I love to code in java programming";
        String[] words=str.split("\\s");
        String res="";
        for(int i=0;i< words.length;i++) {
            if (words[i].length() > res.length()) {
                res = words[i];
            }
        }
        System.out.println(res.toString());

    }
}