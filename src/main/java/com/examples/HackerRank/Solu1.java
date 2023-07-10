package com.examples.HackerRank;

import java.util.Scanner;

public class Solu1 {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }
        in.close();
    }
}
