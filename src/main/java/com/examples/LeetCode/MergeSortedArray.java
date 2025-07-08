package com.examples.LeetCode;


import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String args[]){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8} ;

        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 =    len1+len2;
        System.out.println(len3);
        int res [] = new int[len3];

        for (int i=0;i< len1;i++){
         res[i]= arr1[i];

        }

        for (int i=0;i<len2;i++){
            res[len1 + i] = arr2[i];
        }

System.out.println(Arrays.toString(res));



    }

}
