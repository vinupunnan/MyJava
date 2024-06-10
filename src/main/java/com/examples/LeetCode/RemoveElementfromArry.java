package com.examples.LeetCode;

import java.util.Arrays;

public class RemoveElementfromArry {
    //To Do if the elmet to  be removed not present
    public static void main (String args[]){
        int[] arr = {1,3,6,7,9,10,11,23,33};
        int toRemove = 3;
        int[] newArr = new int[arr.length-1];
        int count =0;

        for(int i =0;i<arr.length;i++){

            if(arr[i] != toRemove ){

                newArr[count]  = arr[i];
                count ++;

            }
        }
if(count > newArr.length){
    System.out.println(" We cant find the element in the array");
}

        System.out.println(Arrays.toString(newArr));
    }
}
