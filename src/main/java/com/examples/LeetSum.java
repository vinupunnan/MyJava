package com.examples;

public class LeetSum {
    public static void main(String args[]) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] answer = test(nums, target);


       

    }

    private static int[] test(int[] nums, int target) {
        int[] answer = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};

                }
            }
        }
      return  answer;
    }
}
