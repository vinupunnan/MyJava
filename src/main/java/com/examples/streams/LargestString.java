package com.examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestString {
    public static void main(String args[]){
        List<String> strings = Arrays
                .asList("apple", "banana", "cherryyyyyyyy", "date", "grapefruit");
      Optional<String> result = strings.stream().max(Comparator.comparingInt(e->e.length()));
        System.out.println(result.get());
    }
}
