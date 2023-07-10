package com.examples.test;

import java.util.Arrays;

public class ArrayExample1 {
    public  static void main(String args[]) {
        int integerArray[] = {1, 4, 9, 2, 3, 5};
       int testArray[]= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(integerArray));
        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        for(int i =0;i< testArray.length; i++){
            System.out.println(testArray[i]);

        }
    }

}
