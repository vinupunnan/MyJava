package com.examples;

public class Test {
    public static void main(String args[]){
        int a = 1234;
        String  b = "1234";

        String[] brray = b.split("");
        String newString  = null;


       for(String s : brray ){

           newString = newString+s;
       }


    }



}
