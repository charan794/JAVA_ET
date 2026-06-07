package org.example.Day03;

public class ex {
    static void main(String[] args) {
        String str="1c0c1c1a0b1";
        int result=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            int value =str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='c'){
                result=result^value;
            }
            if(ch=='a'){
                result=result & value;
            }
            if(ch=='b'){
                result=result | value;
            }


        }
        System.out.println(result);
    }
}