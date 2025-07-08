package com.examples.LeetCode;

import java.util.Arrays;

public class RemoveElemnts {
    public static void main(String args[]) {
        int[] numArr = {12, 2, 2, 4, 5, 55, 6, 3, 2, 11};
        int val = 2;
        int firstLen = numArr.length;
        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == val) {
                count = count + 1;
            }

        }
        int resultArraycount = firstLen - count;

        int index = 0;
        int[] resultArry = new int[resultArraycount];
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != val) {
                resultArry[index++] = numArr[i];

            }


        }
        System.out.println(Arrays.toString(resultArry));
        System.out.println(resultArry.length);
    }
}