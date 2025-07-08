package com.examples.array;


import java.time.Instant;
import java.util.Date;

public class ArraySumTarget {
    public static void  main (String args[]){
        int[] arr = {1,3,4,5,7,2};
        int target = 8 ;
String str = "2024-12-31T12:00:00.000Z";
Instant dateInInstant = Instant.parse(str);
Date t = Date.from(dateInInstant);
System.out.println(t);


    }
}
