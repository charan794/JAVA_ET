package org.example.Day02;

public class Stock {
    public static void main(String[] args) {
        System.out.println(profit(new int[]{4,2}));
    }
    public static int profit(int arr[]){
        int buy=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy){
                profit+=arr[i-1]-buy;
                if(i!=arr.length-1){
                    buy=arr[i];
                }
            }
            if(i==arr.length-1){
                profit+=(arr[i]-buy);
            }
        }
        return profit;
    }
}
