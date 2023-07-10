package com.examples.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ComparingClass {
    public static void main(String[] args) {

        Student std1 = new Student(21, "Vinod", "Kaitharam");
        Student std2 = new Student(31, "Aiby", "Cherai");
        Student std3 = new Student(22, "Sumesh", "MuvatuPuzha");
        Student std4 = new Student(22, "Ghori", "Kaitharam");
        Student std5 = new Student(11, "Aji", "Kothakulam");
        Student std6 = new Student(10, "Pradeep", "Chendamangalam");
        List<Student> studentList = new ArrayList<Student>();
        ;
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);
        studentList.add(std5);
        studentList.add(std6);
        System.out.println(studentList);

        Collections.sort(studentList, new MyNamesComparator());
        System.out.println(studentList);

    }
}
