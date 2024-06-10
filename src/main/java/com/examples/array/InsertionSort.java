package com.examples.array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = {12, 1, 33, 4, 55, 22};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j-1 ]> temp) {
             arr[j] = arr[j-1];
             j--;
            }
            arr[j] = temp;


        }
        System.out.println(Arrays.toString(arr));
    }

}