package com.examples.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String args[]) {
        String str = "Hello My Dear wrong number ";
        String[] strArray = str.split("");
        System.out.println(Arrays.toString(strArray));
        Set<String> hs = new LinkedHashSet<>();
        for(int i =0;i<strArray.length; i++){
            hs.add(strArray[i]);
        }
       System.out.println(hs);
    }
}