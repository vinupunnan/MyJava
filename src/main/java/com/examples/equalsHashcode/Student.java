package com.examples.equalsHashcode;

import java.util.Objects;

public class Student {
    private String rollNo;
    private String name;

    public Student(){
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo.equals(student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    public Student(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String rollNo) {
        this.rollNo = rollNo;

    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
