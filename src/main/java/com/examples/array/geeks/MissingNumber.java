package com.examples.array.geeks;
/* Given a consequent Series .Need to find  the missing number from that series*/
public class MissingNumber {
    public static void main(String args[]) throws Exception {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int n = arr.length;
        int start = arr[0];
        System.out.println("Start element is " + start);
        int end = arr[arr.length - 1];
        System.out.println("End element is " + end);
        int sum = 0;
        int newSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("First Sum is " + sum);

        for (int i = start; i <= end; i++) {
            // System.out.println(i);
            newSum = i + newSum;

        }
        System.out.println("Second  Sum is " + newSum);
        System.out.println("The missing number from the consequent series is " + (newSum - sum));
    }
}