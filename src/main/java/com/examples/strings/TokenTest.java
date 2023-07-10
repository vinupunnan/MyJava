package com.examples.strings;

import java.util.Scanner;

public class TokenTest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);


        if (!scanner.hasNext()){
            System.out.println(0);
        }else {
            String s = scanner.nextLine();
           // String[] split = ("@" + s).split("\\W+");
            String[] split = s.trim().split("[ !,?._'@]+");
            int words = split.length - 1;
            System.out.println(split.length );
            for (int i = 0; i <= words; i++) {
                System.out.println(split[i]);
            }
        }


    }
}
