package com.examples.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Program  Given a list of integers, separate odd and even numbers?
public class OddAndEvenList {
    public static void main(String args[]) throws Exception {
        Integer[] integerArray = {12, 34, 23, 45, 56, 78, 99, 35, 24};
        List<Integer> integerList = Arrays.asList(integerArray);
        List<Integer> test = integerList.stream().sorted().collect(Collectors.toList());
        for (Integer integer : test) {
            System.out.println(integer);
        }
        System.out.println("=======================================");
        List<Integer> evenList = integerList.stream().filter(il -> il % 2 == 0).collect(Collectors.toList());

        for (Integer integer : evenList) {
            System.out.println(integer);
        }

        System.out.println("=======================================");
        List<Integer> oddList = integerList.stream().filter(il -> il % 2 != 0).collect(Collectors.toList());

        for (Integer integer : oddList) {
            System.out.println(integer);
        }
    }
}

