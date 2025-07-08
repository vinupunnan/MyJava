package com.examples.array.geeks;

import java.util.Arrays;

public class SecondLargestNumbe {
    public static void main(String args[]) {
        /* first method using sort
        int[] arr = {12,33,11,44,55,11,44};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
        */
        int[] arr = {12, 33, 11, 66, 55, 11, 44, 57};
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];


            } else if (arr[i] > secondLargest || arr[i] == secondLargest) {
                secondLargest = arr[i];
            }

        }

        System.out.println(secondLargest);

    }
}
