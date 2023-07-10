package com.examples.basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String args[]){
       String newLine =  System.lineSeparator();
       System.out.println("Enter the number");
       Scanner sc =new Scanner(System.in);
       int s =sc.nextInt();
       for(int i=1;i<10;i++){
           System.out.println( +s +"x" +i + "=" +(s*i)+ newLine);

       }
    }
}
