package com.examples.array;
//Programme to find the lowest and man number in array
public class MaxMin {
    public static void main(String args[]) {

        int[] arr = {12, 4, 9, 99, 33, 5, 11};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("maximunm number is " + max);
        System.out.println("minimum  number is " + min);
    }

}
