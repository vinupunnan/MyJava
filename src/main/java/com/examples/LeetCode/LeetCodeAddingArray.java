package com.examples.LeetCode;

import java.util.Arrays;

public class LeetCodeAddingArray {
    public static void main(String args[]){
        int[] arr = {1,1,1,1,1};
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7},{6,6,6} };
        int [] newArr = new int[arr.length];
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = arr[i] + sum;
            newArr[i]=sum;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
