package com.examples.CollectionEx.utils;

import java.util.Comparator;
import java.util.Map;

public class EmployeeMapCompare implements Comparator<Map.Entry<Integer,Employee>> {

    public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
        return o1.getValue().name.compareToIgnoreCase(o2.getValue().name);
    }

}
