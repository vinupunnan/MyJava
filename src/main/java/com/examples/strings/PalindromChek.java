package com.examples.strings;

public class PalindromChek {
    public static void main (String args[]){

        String input =   "Was it a car or a cat I saw?";
String first = input.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(first);

StringBuilder b = new StringBuilder(first);
String newString = b.reverse().toString();
System.out.println(newString);
if(first.equalsIgnoreCase(newString)){
    System.out.println("The string is palindrome");
}else{
    System.out.println("String not Palidrome");
}


    }
}
