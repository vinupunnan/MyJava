package com.examples.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args){
       String[] strArr= {"Raj","Taj","Aaj"} ;

        Collections.sort( Arrays.asList(strArr));
        System.out.println(Arrays.toString(strArr));
    }
}
