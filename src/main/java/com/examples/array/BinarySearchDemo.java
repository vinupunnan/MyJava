package com.examples.array;

public class BinarySearchDemo {
    public static void main(String args[]) {
        int[] arr = {1, 5, 7, 9, 11, 22, 24, 33, 45, 67, 89};
        int val =12;
        int start = 0;
        int end = arr.length-1;
        int mid = start+end /2;

        while(arr[mid] != val && start<=end){
            if(arr[mid] < val){
                start = mid+1;
            }else{
                end =mid-1;
            }
            mid = (start+end)/2;

            System.out.println(arr[mid]);
        }
        if(arr[mid] == val) {
            System.out.println("position of the element" + mid);
        }else{
            System.out.println("Element not found");
        }

    }

}