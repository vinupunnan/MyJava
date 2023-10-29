package com.examples.array;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentItem {
    public static void main(String args[]) {
        int[] integerArray = {1, 2, 3, 1,3,4,5,6,8,3,3};
        Map<Integer,Integer> testMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < integerArray.length; i++) {
            int key = integerArray[i];
            int count = checkCount(key, integerArray);
            testMap.put(key, count);
        }
        int maxValue = 0;
        int maxOccurance=0;
        for(Map.Entry me : testMap.entrySet()){

           int maxval = (int) me.getValue();
           if(maxval > maxValue){
               maxValue =maxval;
               maxOccurance = (int) me.getKey();
           }

        }

System.out.println("The max repeted val is " +maxOccurance);
    }

    private static int checkCount(int key, int[] tet) {
        int count = 0;
        for (int i = 0; i < tet.length; i++) {
            if (tet[i] == key) {
                count++;
            }
        }
        return count;
    }
}
