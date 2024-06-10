package com.examples.array.geeks;

import java.util.HashMap;

public class ArrayMaxMin2 {

    public static void main(String args[]) {

        int[] arr = {12, 1234, 45, 67, 1};
        int maxValue = getMaxValue(arr);
        int minValue = getMinValue(arr);
        System.out.println("The maximum  value in this array is " + maxValue);
        System.out.println("The minumum value in this array is " + minValue);

    }

    private static int getMaxValue(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxNumber = Math.max(maxNumber, arr[i]);

        }
        return maxNumber;
    }

    private static int getMinValue(int[] arr) {
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxNumber = Math.min(maxNumber, arr[i]);

        }

        return maxNumber;
    }

}
