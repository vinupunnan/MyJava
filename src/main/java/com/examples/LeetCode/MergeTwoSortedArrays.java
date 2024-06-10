package com.examples.LeetCode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String args[]) {

        int[] nums1 = {1,2,3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;
        pleaseMerge(nums1, m, nums2, n);


    }

    private static void pleaseMerge(int[] nums1, int m, int[] nums2, int n) {

        int l = m + n;
        int[] nums3 = new int[l];
        int count =0;

        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i] !=0) {
                nums3[count] = nums1[i];
                count++;
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if(nums2[j] !=0) {
                nums3[count] = nums2[j];
                count++;
            }
        }
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));

    }
}