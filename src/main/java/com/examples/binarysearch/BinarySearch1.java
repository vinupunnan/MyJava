package com.examples.binarysearch;

public class BinarySearch1 {

        public static void main(String args[])throws Exception
        {
            int nums[]= {1,2,3,5,9,11,17,20};
            int target = 17;
            System.out.println(nums[4]);
            Integer test ;
            if(target>nums[4]){
                System.out.println("Test the second half");
            }else{
                System.out.println("Test the first half");
            }

        }
}
