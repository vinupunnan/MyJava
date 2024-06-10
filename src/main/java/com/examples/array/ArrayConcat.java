package com.examples.array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayConcat {
    //concat two arrays using old method
    public static int[] firstArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    List<Integer> myList = new ArrayList<>();

    public static void main(String args[]) {
        resultArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[i + firstArray.length] = secondArray[i];
        }

        for (int i = 0; i < resultArray.length; i++) {
           System.out.println(resultArray[i]);
        }
    }
}