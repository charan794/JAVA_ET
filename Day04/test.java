package org.example.Day04;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }

        int left=0,right= arr.length-1;
        for(int j=0;j<3;j++){
            int t=arr[j][left];
            arr[j][left]=arr[j][right];
            arr[j][right]=t;
        }
        System.out.println(Arrays.deepToString(arr));
    }}