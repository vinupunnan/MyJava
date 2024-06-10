package com.examples.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String args[]){
    int[] inputArray = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    int arraylegth = inputArray.length;
     int length =  removeDuplicateElements(inputArray,arraylegth);
        for (int i=0; i<length; i++){
            System.out.print(inputArray[i]+" ");
    }

}

    private static int removeDuplicateElements(int[] inputArray, int arraylegth) {
        int j = 0;
        int[] temp = new int[arraylegth];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] != inputArray[i + 1]) {

                temp[j++] = inputArray[i];

            }
        }
        temp[j++] = inputArray[arraylegth - 1];
        System.out.println(j);
       // System.out.println(Arrays.toString(temp));
        for(int i =0 ;i<j; i++){

            inputArray[i] = temp[i];
        }
        System.out.println(Arrays.toString(inputArray));
        return j;
    }
}


