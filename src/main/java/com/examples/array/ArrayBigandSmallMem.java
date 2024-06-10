package com.examples.array;


import java.util.Arrays;

public class ArrayBigandSmallMem {
    //Programme to find the smallest element in an array without using sort method of an array
    public static void main(String args[]) {
     //   String str =
        int[] inputArray = {12, 1, 600, 5, 21, 567};
        int minval = inputArray[0];
        int maxVal = inputArray[0];
        for(int i =0;i<inputArray.length;i++){

            if(inputArray[i] > maxVal){
                maxVal = inputArray[i];
            }

            if(inputArray[i] < minval){
                minval = inputArray[i];
            }

        }
        System.out.println("The minimum value is " +minval);
        System.out.println("The Max value is " +maxVal);

    }
}