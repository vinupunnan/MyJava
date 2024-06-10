package com.examples.array.geeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayFindDuplicates {
    public static void main(String args[]) {
        int[] arr = {1, 6, 5, 2, 3, 3, 2,};
        Map<Long, Integer> freqMap = new HashMap<>();
        HashMap hm = new HashMap();
        ArrayList<Integer> aList = new ArrayList();
        //Use Set for finding the duplicates
        HashSet<Integer> hSet = new HashSet();
        for (int i : arr) {
            if (!hSet.contains(i)) {
                hSet.add(i);
            } else {
                aList.add(i);
            }
//Traverse two times
        }
        System.out.println("The duplicate Values are " + aList);

        //Use one for loop using Arrays.sort first
    }
}
