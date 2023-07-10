package com.examples.array;

import java.util.Arrays;

public class RemoveSpecific {
    public static void main(String[] args){
        int[] numArray = {1,2,3,4,5,7,8,24,22};
        int  numToRemove =8;
        int j =0;
        int[] update = new int[numArray.length-1];
        for(int i =0;i<numArray.length ;i++){
            if(numArray[i] != numToRemove){

                update[j]=numArray[i];
                j =j+1;
            }
        }
        System.out.println("The Array after removing is " + Arrays.toString(update));
    }
    
}
