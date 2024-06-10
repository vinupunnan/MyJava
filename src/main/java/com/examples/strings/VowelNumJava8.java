package com.examples.strings;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class VowelNumJava8 {
    public static void main(String arhs[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        IntPredicate intPredicate = (a) -> hellow(a);
        int count = (int) input.chars().filter(intPredicate).count();
        System.out.println(count);
         }

    private static Boolean hellow(int c) {
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
