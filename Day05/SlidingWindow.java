package org.example.Day05;

public class SlidingWindow {
    public static void main(String[] args){
        int arr[] = {2,9,31,-4,21,7};
        int k=3;
        int msum = 0;
        int wsum = 0;
        for(int i=0;i<k;i++){
            wsum += arr[i];
        }
        msum = wsum;
        for(int i=k;i<arr.length;i++){
            wsum=wsum+arr[i]-arr[i-k];
            msum = Math.max(msum,wsum);
        }
        System.out.println(msum);
    }
}
