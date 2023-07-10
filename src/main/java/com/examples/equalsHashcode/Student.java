package com.examples.equalsHashcode;

public class Student {
    private String rollNo;
    private String name;

    public Student(){
        super();
    }
    public Student(String rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
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
