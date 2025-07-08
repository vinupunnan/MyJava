package com.examples.binarysearch;

public class BinarySearch1 {

    public static void main(String args[]) throws Exception {
        int[] nums = {1, 2, 3, 5, 9, 11, 17, 20};
        int len = nums.length;
        int target = 9;
        int middle = nums.length / 2;
        int min = 0;
        int max = len-1;

        while (nums[middle] != target) {

            if (target > nums[middle]) {
                min = middle + 1;
            }

            if (target < nums[middle]) {
                max = middle - 1;
            }

            middle = (min + max)/ 2;
           // System.out.println(middle);


        }
        System.out.println(middle);
    }
}