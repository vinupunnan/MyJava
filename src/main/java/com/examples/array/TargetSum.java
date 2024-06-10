package com.examples.array;

import java.util.Arrays;

public class TargetSum {
    public static void main(String args[]) {
        int[] nums = {1, 4, 5, 1, 3};
        int target = 9;
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
