package com.examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String args[]){

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
      Optional<String> str=  strings.stream().max(Comparator.comparingInt(e->e.length()));
      System.out.println(str.get());
    }
}
