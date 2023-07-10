package com.examples.basic;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String name = myObj.nextLine();
      StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
