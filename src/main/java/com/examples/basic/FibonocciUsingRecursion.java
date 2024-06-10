package com.examples.basic;

public class FibonocciUsingRecursion {
   public static void main(String args[]){
int n = fact(5);
System.out.println(n);



   }

    private static int fact(int n) {
       int result;
       if(n ==1 ){
           return 1;
       }
       result= fact(n-1)*n;
       return result;
    }
}
