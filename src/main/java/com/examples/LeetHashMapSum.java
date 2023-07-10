package com.examples;

import java.util.HashMap;

public class LeetHashMapSum {
    public static void main(String args[]){
        int[] nums = {2, 11, 7, 15};
        int target = 9;

        HashMap hm = new HashMap();
        for(int i =0;i<nums.length; i++){
            hm.put(i,nums[i]);
        }
    }

}
