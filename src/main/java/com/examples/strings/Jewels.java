package com.examples.strings;

import java.util.HashMap;

public class Jewels {
    public static void main(String args[]) {
        String jewels = "rs";
        String stone = "Asdrsdfrsdfr";

       HashMap<String,Integer> hm = new HashMap<>();
       String[] jewelsArray=  jewels.split("");

       for(int i=0;i<jewelsArray.length;i ++){
           hm.put(jewelsArray[i],0);

       }

        System.out.println(hm);
       String[] stoneArray = stone.split("");
       int count =0;

       for(int i =0;i< stoneArray.length;i++){
           if(hm.containsKey(stoneArray[i])){
               count++;
           }

       }
System.out.println(count);
    }
}