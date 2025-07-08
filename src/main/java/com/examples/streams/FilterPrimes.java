package com.examples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPrimes {
    public static void main(String args[]) {
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15, 7, 5);
        List<Integer> primeNumList = integerList.stream().filter(e -> isPrime(e)).collect(Collectors.toList());
        System.out.println(primeNumList);
    }

    private static boolean isPrime(Integer e) {
        int count = 0;
        if (e == 1) {
            return true;
        }
        for (int i = 2; i < e; i++) {
            int test = e % i;
            if (test == 0) {
                count = count + 1;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
