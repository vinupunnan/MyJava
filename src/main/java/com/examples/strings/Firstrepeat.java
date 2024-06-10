package com.examples.strings;

public class Firstrepeat {
    public static void main(String args[]) {
        String test = "aabb cdd eef";
        String input = test.replaceAll("[^a-zA-Z0-9]", "");
        String[] myArray = input.split("");
        for (String s : myArray) {
            if((input.indexOf(s) == input.lastIndexOf(s))){
                System.out.println("The first non repeated " +s);
                break;
            }
        }

    }
}