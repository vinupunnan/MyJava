package com.examples.basic;

import java.util.Date;
import java.util.List;

public final class ImmutableEmployee {
    //declare class as final
    //declare feids as final

    private final String name;

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", mobile=" + mobile +
                '}';
    }

    private final Date dob;

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public List<String> getMobile() {
        return mobile;
    }

    private final List<String> mobile;

    public ImmutableEmployee(String name, Date dob, List<String> mobile) {
        this.name = name;
        this.dob = dob;
        this.mobile = mobile;
    }
}
