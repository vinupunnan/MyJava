package com.examples.strings;

import java.util.Scanner;

public class VowelNumTraditional {
    public static void main(String args[]) {
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        String inuptString = scanner.nextLine();
        System.out.print("the strings is " + inuptString);
        int count = 0;
        for (int i = 0; i <inuptString.length(); i++) {
            if (isVowel(inuptString.charAt(i))) {
                count++;
            }
        }

        System.out.println("count is " +count );
    }

    private static boolean isVowel(char c) {
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u' ||
                c == 'A' ||
                c == 'E' ||
                c == 'I' ||
                c == 'O' ||
                c == 'U';


    }
}
