package com.examples.loops;

public class InnerWhile {
    public static void main(String args[]) {
        int j =0;
        while (j < 5) {
            int i = 0;
            while (i < 10) {
                System.out.print("Q");
                i++;
            }
            System.out.println("");
            j++;
        }
    }
}
