package com.examples.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElseHacker1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        boolean result = computeN(n);
        if(result){
            System.out.print("Not Weird");
        }else{
            System.out.print("Weird");
        }
        scanner.close();
    }

    public static boolean computeN(int n) {
        if (n % 2 != 0) {

            return false;
        }
        if(n>20){

            return true;
        }else{
            if(n<5 && n >2){
               return true;
            }
            if(n>=6 && n<=20){
              return false;
            }
        }


        return true;
    }


}

