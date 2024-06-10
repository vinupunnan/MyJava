package com.examples.array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ArrayConcat2 {
    public  static void main (String args[]){
        int[] firstArray = {11,12,23,24,35,36};
        int[] secondArray = {47,48,59,60,61,62,73,74};
        int[] joinedArray = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray,0,joinedArray,0,firstArray.length);
        System.arraycopy(secondArray,0,joinedArray,firstArray.length,secondArray.length);
        System.out.println(Arrays.toString(joinedArray));


    }
}
