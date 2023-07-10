package com.examples.LeetCode;

public class SortArrayTest {
    public static void main(String args[]){
        int testArr[] =  {1,2,3,3,4,4,5};
        System.out.println(testArr.length);
        int nums[] = {2,7,11,15};
        int target = 9;
      for(int i=0;i<nums.length;i++){
          if (target == nums[i] + nums[i+1]) {
              System.out.print(i);
              System.out.print(i+1);
              break;
          }
      }

    }
}
