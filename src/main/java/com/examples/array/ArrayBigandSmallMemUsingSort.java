package com.examples.array;

import java.util.Arrays;

public class ArrayBigandSmallMemUsingSort {
    public static void main(String args[]){
        int[] inputArray = {12, 1, 600, 5, 21, 567};
        Arrays.sort(inputArray);
        System.out.println("The biggest is" +inputArray[inputArray.length-1]);
        System.out.println("The smallest is" +inputArray[0]);

    }
}
