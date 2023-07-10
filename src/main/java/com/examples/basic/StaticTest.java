package com.examples.basic;

import java.util.Scanner;

public class StaticTest {
    static {
        System.out.println("Enter the Numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flag = false;
        try {
            if (a <=0 || b <=0) {

                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        if (flag) {
            System.out.println(a * b);
        } else {
            System.exit(0);
        }


    }

}
