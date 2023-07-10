package com.examples.HackerRank;

import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
       String test = sb.reverse().toString();
        System.out.println(test);
    }
}
