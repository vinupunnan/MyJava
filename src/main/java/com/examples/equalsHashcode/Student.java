package com.examples.equalsHashcode;

import java.util.Objects;

public class Student {
    private String rollNo;
    private String name;

    private String  grade;

    public Student(){
        super();
    }

    public Student(String rollNo) {
        this.rollNo = rollNo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo == null) {
            if (other.rollNo != null)
                return false;
        } else if (!rollNo.equals(other.rollNo))
            return false;
        return true;
    }

}
