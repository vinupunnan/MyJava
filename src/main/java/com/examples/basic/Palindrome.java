package com.examples.basic;

public class Palindrome {
    public static void main(String args[]){
        String str = "noondd";
        StringBuilder strBuild = new StringBuilder(str);
        String reverese =strBuild.reverse().toString();
        if(str.equals(reverese)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
