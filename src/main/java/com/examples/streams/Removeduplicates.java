package com.examples.streams;

import java.util.Arrays;

public class Removeduplicates {
    public static  void main (String args[]){
        int [] arr = {1,2,1,2,3,4,4,5,6};

       // [1, 1, 2, 2, 3, 4, 4, 5, 6]
        int [] temp = new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int j =0 ;
        for(int i =0;i<arr.length-1;i++){
            if (arr[i] != arr[i+1]) {
                temp[j]= arr[i];
                j = j+1;
            }
        }
       temp[j]= arr[arr.length-1];
System.out.println(j);
        for(int i =0 ;i<j;i++){
            arr[i] =temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
