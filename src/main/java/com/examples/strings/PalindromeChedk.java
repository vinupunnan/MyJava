package com.examples.strings;

public class PalindromeChedk {
    public static void main(String args[]) throws Exception{
         String s = "civic";

            int left = 0;;
            int  right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return;
                }
                left++;
                right--;
            }
            System.out.println("IS Pli");
        }
    }

