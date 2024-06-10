package com.examples.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {33, 22, 44, 11, 55, 88};


        for (int j = 0; j < arr.length; j++) {
            int minimumIndex = j;

            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                }


                if (arr[j] != arr[minimumIndex]) {
                    int temp = arr[j];
                    arr[j] = arr[minimumIndex];
                    arr[minimumIndex] = temp;

                }

            }
        }
        System.out.println("Sorted array using the selection sort " + Arrays.toString(arr));

    }

}