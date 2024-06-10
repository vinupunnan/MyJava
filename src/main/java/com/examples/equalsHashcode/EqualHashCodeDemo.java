package com.examples.equalsHashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualHashCodeDemo {
    public static void main(String[] args){
       Student s1 = new Student("1234");
       Student s2 = new Student("1234");
       //if equuals and hshcode is not overridden this fill be false
        Map<Student,ReportCard> hm = new HashMap<>();
hm.put(s1,new ReportCard(12.0,11.0));
        hm.put(s2,new ReportCard(12.0,11.0));

System.out.println(hm.size());
    }
}
