package com.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListComparison {
    public static void main (String args[]){
        List<Code> codeListOne = new ArrayList<>();
        List<Code> codeListTwo = new ArrayList<>();
        Code code1 = new Code("001","code1");
        codeListOne.add(code1);
        Code code2 = new Code("002","code2");
        codeListOne.add(code2);
        Code code3 = new Code("003","code3");
        codeListOne.add(code3);
        Code code4 = new Code("004","code4");
        codeListOne.add(code4);
        List result1 = codeListOne.stream().sorted((o1, o2)->o1.getCode1().
                compareTo(o2.getCode1())).
                collect(Collectors.toList());

        Code code5 = new Code("001","code1");
        codeListTwo.add(code5);
        Code code6 = new Code("002","code2");
        codeListTwo.add(code6);
        Code code7 = new Code("003","code3");
        codeListTwo.add(code7);
        Code code8 = new Code("004","code4");
        codeListTwo.add(code8);
        List result2 = codeListTwo.stream().sorted((o1, o2)->o1.getCode1().
                compareTo(o2.getCode1())).
                collect(Collectors.toList());


        System.out.println(result1.equals(result2));

    }
}
