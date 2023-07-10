package com.examples.test;

public class Employee {
    private String name;
    private String code;

    public Employee(String name, String code, String designation) {
        this.name = name;
        this.code = code;
        this.designation = designation;
    }

    private String  designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

