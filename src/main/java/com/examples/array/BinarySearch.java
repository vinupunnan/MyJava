package com.examples.array;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1, 5, 7, 9, 11, 22, 24, 33, 45, 67, 89};
        int target = 11;
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        System.out.println("" + arr[end]);
        System.out.println("The Middle element" + arr[middle]);

        while (arr[middle] != target) {
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {

                start = middle + 1;
            }
            middle = (start + end) / 2;
        }
        System.out.println("the element is located ate the index " + middle);
    }
}