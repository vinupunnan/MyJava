package com.examples.strings;

import java.util.Scanner;

public class Manipulation {
    public static void main(String args[]){
        System.out.println("Enter the Strings ");
                Scanner scanner = new Scanner(System.in);
                String s1 =scanner.next();
                String s2 = scanner .next();
        String s3 = capitalizeFirst(s1);
        String s4 = capitalizeFirst(s2);
                String lineSeparator = System.lineSeparator();
                 System.out.print(s1.length() + s2.length() +lineSeparator);
                 System.out.print(s1.compareTo(s2) > 0 ? "Yes" +lineSeparator:"No"+lineSeparator);
                 System.out.print(s3 +" " + s4 );

    }

    private static String capitalizeFirst(String s) {
      return  s.substring(0,1).toUpperCase() + s.substring(1,s.length());
    }
}
