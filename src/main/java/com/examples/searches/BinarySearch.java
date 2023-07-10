package com.examples.searches;

public class BinarySearch {

    public static void main(String args[]) {
int[] numbs = {1,2,4,5,7,9,11};
int find = 1;
   System.out.println( executeSearh(numbs,find));
    }


    public static int executeSearh(int numbers[], int numberTofind) {

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleNumber = numbers[middleIndex];


            if (numberTofind == middleNumber) {
                return middleIndex;
            }
            if (numberTofind < middleNumber) {
                high = middleIndex - 1;
            } else {
                low = middleIndex + 1;
            }

        }
        return -1;

    }
}