package org.example.Day01;
import java.util.Scanner;
public class ratproblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rats");
        int r= sc.nextInt();
        System.out.println("Enter no. of units");
        int units = sc.nextInt();
        int[] arr = {2,8,3,5,7,4,1,2};
        int total = r*units;
        int sum = 0;
        if(arr.length==0){
            System.out.println("-1");
        }
        int count=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
            if(sum>=total){
                System.out.println("No.of houses: "+(i+1));
                break;
            }
        }
    }
}
