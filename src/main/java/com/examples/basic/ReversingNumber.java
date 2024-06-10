package com.examples.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingNumber {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int enteredNumber = s.nextInt();
        System.out.println(enteredNumber);
        if(enteredNumber ==0){
            System.out.println("That is not a relevant number");
        }
        int diff =0 ;
        int count =0;
       while (diff != 6174) {

            char[] stringArray = Integer.toString(enteredNumber).toCharArray();
            Arrays.sort(stringArray);
            String small = new String(stringArray).trim();
            int smallInt = Integer.parseInt(small);
             StringBuilder builder = new StringBuilder(small);
            String largeStr = builder.reverse().toString();
            int largeInt = Integer.parseInt(largeStr);
            diff = largeInt -smallInt;
            System.out.println(diff);
            enteredNumber =diff;
            count = count+1;

        }
   System.out.println(count);
    }

}