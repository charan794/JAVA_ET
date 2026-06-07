package org.example.Day01;
import java.util.Scanner;
import java.util.Arrays;
public class rotate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int left=0,right=2;
        for(int i=0;i<3;i++){

            int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
        System.out.println(Arrays.deepToString(arr));
    }
}
