package com.examples.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int intialArraySize = scanner.nextInt();
        scanner.nextLine();  // Consume newline l2eft-over
        String str1 = scanner.nextLine();
        List testList = new ArrayList(intialArraySize);
        str1.split(" ");
        testList.addAll(Arrays.asList(str1.split(" ")));
        int noOfQur = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < noOfQur; i++) {
            String queryName = scanner.nextLine();

            if (queryName.equals("Insert")) {
                String str2 = scanner.nextLine();
                String[] test = str2.split(" ");
                int postion = Integer.parseInt(test[0]);
                int no = Integer.parseInt(test[1]);
                testList.add(postion, no);

            }
            if (queryName.equals("Delete")) {

                String test = scanner.nextLine();
                testList.remove(Integer.parseInt(test));

            }
        }

        StringBuilder builder = new StringBuilder();
        for (Object value : testList) {
            builder.append(value + " ");
        }
        String text = builder.toString();
        System.out.println(text);
    }
}


