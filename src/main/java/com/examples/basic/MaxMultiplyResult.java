package com.examples.basic;

public class MaxMultiplyResult {
    public static void main(String args[]) {


        int[] num = {10, 2, 3, 6, 7};
        int high =0;
        int temp =0;
        for(int i =0;i<num.length;i++){
           for(int j= i+1; j<num.length;j++) {
               temp = num[i] * num[j];
               if(temp>high){
                   high =temp;
               }
           }
        }

System.out.println(high);
    }
}