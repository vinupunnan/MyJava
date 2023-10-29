package com.examples.array;

import java.util.Arrays;
import java.util.Scanner;

public class MinItemArray {
    public static void main(String args[])throws Exception {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int enteredNumebr = scanner.nextInt();
        int[] numberArray = new int[enteredNumebr];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numberArray));

        int min = numberArray[0];
        for (int i = 0; i < numberArray.length; i++) {

            if (numberArray[i] < min) {
                min = numberArray[i];
            }

        }
        System.out.println("Minimum Number is " + min);
    }
}
