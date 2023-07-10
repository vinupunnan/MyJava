package com.examples.strings;

import java.util.HashSet;

public class UniqueCharacters {

    public static void main(String args[]) throws Exception {
        String str1 = "apple";
        String str2 = "rhino";

         testUnique(str1);

    }

    private static void testUnique(String str1) {
        HashSet set = new HashSet();
        for(int i =0;i<str1.length();i++) {
            if (set.add(str1.charAt(i)) == false) {
                System.out.println(str1 + "is nonUnique");
                break;
            }
        }

    }
}
