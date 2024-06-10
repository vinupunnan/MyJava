package com.examples.array;

public class PeakItem {
    public static void main(String args[]) throws Exception {

        int[] arr = {19, 9, 3, 12, 5, 22,11};
        System.out.println("ArrayLength " +arr.length);
        for (int i = 1; i < arr.length; i++) {
          if( i + 1 <= arr.length) {
                if (i + 1 < arr.length && i - 1 < arr.length) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        System.out.println("Peak Element  is " + arr[i]);
                    }
                }
               if(i+1 == arr.length){
                   if(arr[arr.length-1] > arr[arr.length-2]){
                       System.out.println("Peak Element  is " + arr[arr.length-1]);
                   }

               }

            }

        }
    }


}
