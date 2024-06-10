package com.examples.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSpecificTwo {
    public static void main(String args[]){
        Integer[] numArray = {1,2,3,4,5,7,8,24,22};
        int  numToRemove =8;
        ArrayList<Integer> testList
                =
                new ArrayList<Integer>(Arrays.asList(numArray));
        testList.remove(Integer.valueOf(8));
        System.out.println(testList);
        //Integer[] arr = new Integer[testList.size()];

        System.out.println(Arrays.toString(testList.toArray()));

    }
}
