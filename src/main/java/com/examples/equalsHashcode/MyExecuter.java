package com.examples.equalsHashcode;

public class MyExecuter {
    public static void main(String[] args){
        Student student1 = new Student("ST001");
        Student student2 = new Student("ST001");
        System.out.println(student1.equals(student2));

    }
}
