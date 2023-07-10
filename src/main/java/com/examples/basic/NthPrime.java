package com.examples.basic;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args){
        /*
         First, you take input from the user asking the value of n.

         Then you run a loop finding all the prime numbers.
                    Whenever a prime number is found, the count is increased and
                    if the count is equal to the input of user
        (i.e., if the prime number found is the nth prime number), then print it.
         */

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to compute the nth prime number: ");
        int nth = sc.nextInt();
        int num, count, i;
        num=1;
        count=0;

        while (count < nth){
            num=num+1;
            for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){//if it is a prime number
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);
    }

    }

