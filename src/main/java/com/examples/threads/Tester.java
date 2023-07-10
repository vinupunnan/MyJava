package com.examples.threads;

import java.util.Scanner;

public class Tester {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = MathFunctions.calculateFact(number);
        System.out.println("Factorial is " +factorial);
    }

}
