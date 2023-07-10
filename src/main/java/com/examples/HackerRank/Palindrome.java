package com.examples.HackerRank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder(s);
        String reversed =sb.reverse().toString();
        if (s.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
