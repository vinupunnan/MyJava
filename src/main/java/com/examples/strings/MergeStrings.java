package com.examples.strings;

public class MergeStrings {
    public static void main(String args[]){
        String str1 ="One";
        String str2 ="two";
        int test = str1.length()+str2.length();
        System.out.println(test);
        StringBuilder builder  = new StringBuilder();
        for(int i =0;i<str1.length() ;i++){
            builder.append(str1.charAt(i));
            builder.append(str2.charAt(i));

        }
System.out.println(builder.toString());
        }
    }

