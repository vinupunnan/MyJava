package com.examples.strings;

public class Firstrepeat {
    public static void main(String args[]) {
        String test = "aabb cdd eef";
        String input = test.replaceAll("[^a-zA-Z0-9]", "");
        int length = input.length();
        String[] myArray = input.split("");
        int n = 3;
        int first =0;
        int second = n;
        String hello ="";
        int displayLen = 0;
       int count =0;
        while(count <=4){
             hello = input.substring(first,second);
            displayLen = displayLen + hello.length();
            System.out.println(hello);
            first = first +n;
            second =second+n;
  count = count +1;
        }


     if(displayLen < length){
         hello = input.substring(displayLen,length);
         System.out.println(hello);
     }

//        for (String s : myArray) {
//            if((input.indexOf(s) == input.lastIndexOf(s))){
//                System.out.println("The first non repeated " +s);
//                break;
//            }
//        }

    }
}