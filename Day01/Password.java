package org.example.Day01;
import java.util.Scanner;
public class Password {
    static int checkPassword(char[] str,int n){
        if(str.length<4){
            return 0;
        }
        int cap=0;
        int num=0;
        for(int i=0;i<n;i++){
            char ch = str[i];
            if(ch==' '||ch=='/'){
                return 0;
            }
            if(ch>='A'&&ch<='Z'){
                cap++;
            }
            if(ch>='0'&&ch<='9'){
                num++;
            }
        }
        return ((cap>0 && num>0)?1:0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] str = st.toCharArray();
        int n = str.length;
        System.out.println(checkPassword(str,n));
    }
}
