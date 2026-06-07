package org.example.Patterns;

public class gapRectangle {
    static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
