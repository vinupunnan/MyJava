package com.examples.array;

import java.util.Arrays;

public class SingleDimensionalArrayMain {
    public static void main(String args[]) throws Exception {
        SingleDimensonalArray sdArray = new SingleDimensonalArray(5);
        System.out.println(Arrays.toString(sdArray.intArray));

        sdArray.insert(0, 12);
        sdArray.insert(6, 5);
        System.out.println(Arrays.toString(sdArray.intArray));
        System.out.println("Programme finished ");
    }
}