package com.examples.loops;

import java.util.Scanner;

public class WhileExample {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (keyboard.hasNextInt()) {
                sum = sum + keyboard.nextInt();
            } else if (keyboard.hasNextLine()) {
                if (keyboard.nextLine().equalsIgnoreCase("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);


    }
}
