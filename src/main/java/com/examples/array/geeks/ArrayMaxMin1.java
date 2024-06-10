package com.examples.array.geeks;

import java.util.Arrays;

public class ArrayMaxMin1 {
    public static void main(String args[]) throws Exception {
        int arr[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        int max = Arrays.stream(arr).min().getAsInt();
        int min = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        System.out.println(min);
    }

}
