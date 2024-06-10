package com.examples.strings;

import java.util.*;

public class VowelSort {
    static Character[] vowellArr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static void main(String args[]) {
        String str = "RamLakhanuei";
        List<Character> vowelList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            if (IsStringVowel(str.charAt(i))) {
                vowelList.add(str.charAt(i));
            }
        }
        System.out.println(vowelList);
        Collections.sort(vowelList);
        System.out.println(vowelList);
        StringBuilder ans = new StringBuilder();
  int j=0;
        for (int i = 0; i < str.length(); i++) {
            if (IsStringVowel(str.charAt(i))) {
                ans = ans.append(vowelList.get(j));
                j++;
            }else{
                ans = ans.append(str.charAt(i));
            }
        }

    }


    private static boolean IsStringVowel(char c) {
        return Arrays.asList(vowellArr).contains(c);
    }
}