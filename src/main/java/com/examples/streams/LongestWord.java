package com.examples.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestWord {
    public static void main(String args[]){
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

      Optional<String> helllo = strings.stream().max(Comparator.comparingInt(s->s.length()));
      System.out.println(helllo);
    }
}
