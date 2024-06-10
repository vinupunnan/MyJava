package com.examples.array;

import java.util.Arrays;

public class MyArrayInsert {
    public static void main(String args[]) {
        MyArray myArray = new MyArray(12);
        int[] arr = {1,2,3,4,5};
        arr[0]=99;
        System.out.println(Arrays.toString(arr));
     int test[]=   myArray.insert(23,0);
        System.out.println(Arrays.toString(test));
        myArray.insert(23,0);
        myArray.insert(23,12);

    }
}