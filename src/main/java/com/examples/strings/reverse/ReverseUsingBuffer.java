package com.examples.strings.reverse;

import java.util.LinkedList;
import java.util.List;

public class ReverseUsingBuffer {
    public static void main(String args[]){
        String str ="VINOD";
        StringBuilder strBuilder = new StringBuilder(str);
        StringBuilder reversed = strBuilder.reverse();
       System.out.println("The reversed string is " +reversed.toString());
       List testList = new LinkedList<>();

    }
}
