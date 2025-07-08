package com.examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String args[]){

        List<String> fruits = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
    String s=  fruits.stream().max(Comparator.comparing(e->e.length())).get();
    System.out.println(s);


    }
}
