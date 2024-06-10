package com.examples.CollectionEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String args[]){
        List<String> listOne = Arrays.asList("a","b","c");
        List<String> listTne = Arrays.asList("a","b","c");
      List<String> testList =  Stream.concat(listOne.stream(),listTne.stream()).collect(Collectors.toList());
      System.out.println(testList);
    }
}
