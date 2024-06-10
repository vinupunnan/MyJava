package com.examples.basic;

public class PrintThePattern {
    public static void main(String args[]) {
        printPat(4);
    }

    private static void printPat(int pattern) {
        int count = pattern;
        while (count != 0) {
            for (int i = pattern; i > 0; i--) {
                for (int j = 0; j < count; j++) {
                    System.out.print(i);
                }

            }
            count--;
            System.out.print("$");
        }

    }


}

