package com.examples.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LargestSubsequence {
    public static void main(String args[]) {
        int number = 7;
        Integer[] myArray = {6, 2, 1, 9, 4, 5, 3,8,10,11,12,13,14};

        Set<Integer> testSet = Arrays.stream(myArray).collect(Collectors.toSet());


        int test = 0;
        int count = 0;
        int sequnceCount = 1;
        int maxSeq = 0;
        for (int i = 0; i < myArray.length; i++) {
            test = myArray[i] - 1;
            if (testSet.contains(test)) {
                System.out.println("Not the start of squence " + myArray[i]);

            } else {
                System.out.println("start of squence " + myArray[i]);
                int beginSequnce = myArray[i];
                System.out.println("I am a sequence beginer" + beginSequnce);
                boolean flag = true;
                while (flag) {
                    if (testSet.contains(beginSequnce + 1)) {
                        sequnceCount = sequnceCount + 1;
                        beginSequnce = beginSequnce + 1;
                    } else {
                        flag = false;
                    }

                }
                System.out.println("sequnceCount" + sequnceCount);
                maxSeq = Math.max(maxSeq, sequnceCount);
                System.out.println("maxSeq" + maxSeq);

            }

        }


    }}