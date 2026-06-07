package org.example.Day04;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class sumof2d {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
        }
        System.out.println(sum);//sum of 2d array

    }
}