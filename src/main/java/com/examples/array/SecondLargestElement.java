package com.examples.array;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String args[]) throws Exception {
        int[] arr = {12, 4, 5, 22, 90, 11};
        Arrays.sort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length - 2]);

    }




}
