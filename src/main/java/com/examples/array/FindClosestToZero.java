package com.examples.array;

public class FindClosestToZero {
    public static void main(String args[]) {
        int[] nums = {-4, -2, 1, 0, 8};
      //  Math.abs(1);
      //  System.out.println(Math.abs(-4));
        int closest = Math.abs(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < closest) {
                closest = Math.abs(nums[i]);
            }

        }

        System.out.println(closest);
    }
}
