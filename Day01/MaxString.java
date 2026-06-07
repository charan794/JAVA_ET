package org.example.Day01;

public class MaxString {
    public static void main(String[] args){
        String str = "I love to code in Java Programming";
        String[] words = str.split(" ");
        String maxString="";
        for(String word:words){
            if(word.length()>maxString.length()){
                maxString=word;
            }
        }
        System.out.println(maxString);
    }
}
