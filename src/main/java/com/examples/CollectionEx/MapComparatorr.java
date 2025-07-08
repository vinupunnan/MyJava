package com.examples.CollectionEx;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class MapComparatorr implements Comparator<Map.Entry<Integer,String>> {


    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}

