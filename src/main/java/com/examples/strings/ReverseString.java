package com.examples.strings;

import org.apache.commons.lang3.StringUtils;

public class ReverseString {
    public static  void main(String args[]) throws Exception {

      String strIn = "abcdeef";       int length = strIn.length();
       String str = "";
        for (int i = length-1; i>=0; i--) {
            str = str + strIn.charAt(i);
        }
        System.out.println(str);

//        String str = "Vinod";
//        System.out.println(StringUtils.reverse(str));
    }
}
