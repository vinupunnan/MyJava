package com.examples.strings;

public class EqualCheck {

    public static void main(String[] args){
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        System.out.println(s1.equals(s2));
//        char arr[]={'v','i','n','o','d'};
//        String s = new String(arr);
        //The  above  code can be written as
        String s1 ="vinod";
        String test1= "vinod";
        String test = new String("vinod");

        //System.out.println(s);
        String s2 ="JAVA";
        String s3 ="JAVA";
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        String s4 = new String("JAVA");
        String s5 = new String ("JAVA");
       System.out.println(s1 == test1);//True will be the result
        System.out.println(s1.equals(test) );
        System.out.println(s1 == test );
        //System.out.println(s2== s4);
       // System.out.println(s4== s5);


    }
}
