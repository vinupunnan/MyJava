package com.examples.array;

public class SingleDimensonalArray {

    int[] intArray;

    public SingleDimensonalArray(int size) {

        this.intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        int test = intArray.length;
        try {
            if (intArray[index] == Integer.MIN_VALUE) {
                intArray[index] = value;
                System.out.println("The value is succssfully inserted ");
            } else {
                System.out.println("The  value is already inserted ");
            }
        }catch (ArrayIndexOutOfBoundsException e ){

            System.out.println("The Invalid index throwed ArrayIndex out of Bound  Exception ");
        }

    }

}