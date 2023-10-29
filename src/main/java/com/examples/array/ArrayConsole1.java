package com.examples.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayConsole1 {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int number = console.nextInt();
        System.out.println("Number Entered " +number);
        int[] numberArray = new int[number];
        for(int i=0;i<numberArray.length;i++){
            System.out.println("Enter the Next Number ");
            int numberagain = console.nextInt();
            numberArray[i] = numberagain;
        }
        if(number%2 == 0) {
            System.out.println("The first nuber is Even");
            for (int i = numberArray.length-1; i >= 0; i--) {
                System.out.println(numberArray[i]);
            }

        }else{

            System.out.println("The first nuber is ODD");

            for (int i = 0; i < numberArray.length; i++) {
                System.out.println(numberArray[i]);
            }
            }



    }
}
