package com.examples.equalsHashcode;

import java.util.HashSet;
import java.util.Set;

public class MyExecuter {
    public static void main(String[] args){
        Student student1 = new Student("ST001","Anil");
        Student student2 = new Student("ST002","Anil");
        Student student3 = new Student("ST002","Binu");

     Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students.toString());

    }
}
