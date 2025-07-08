package com.examples.strings.reverse;

import org.apache.commons.lang3.StringUtils;

public class ReverseString {
    public static  void main(String args[]) throws Exception {
        String str = "VINOD";
        String[] strArray = str.split("");
        String reverse = "";
        for(int i = strArray.length-1;i>=0;i--){
            reverse = reverse +strArray[i];
        }

        System.out.println(reverse);
    }
}
