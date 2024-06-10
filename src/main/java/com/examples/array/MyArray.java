package com.examples.array;

public class MyArray {
    int[] arr= null;

    public MyArray(int sizeOfArray) {
           arr = new int[sizeOfArray];
        for(int i =0;i<sizeOfArray;i++){
            arr[i]=Integer.MIN_VALUE;
        }

    }

    public int[] insert(int value, int position) {

        if(arr[position]== Integer.MIN_VALUE){
            arr[position]= value;
        }else{
            System.out.println("Already  a position");
        }
        return arr;
    }
}
