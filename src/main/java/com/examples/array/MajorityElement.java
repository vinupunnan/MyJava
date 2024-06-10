package com.examples.array;

public class MajorityElement {
    public static void main(String args[]) {

        int[] nums = {2, 2, 1,2,5,5,5,5,5,5};
         int maxcount =0;
         int maxNumber =0;
        for (int i = 0; i < nums.length; i++) {
            int count =1;
            int test = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(test == nums[j]){
                    count = count+1;
                }
            }
            if(count>maxcount){
                maxcount =count;
                maxNumber=test;
            }

        }
        //System.out.println(maxcount);
        System.out.println(maxNumber);
    }
}
