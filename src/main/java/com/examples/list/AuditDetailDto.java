package com.examples.list;

public class AuditDetailDto {
    private String delta;

    public AuditDetailDto(String delta, String oldval, String newVal) {
        this.delta = delta;
        this.oldval = oldval;
        this.newVal = newVal;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getOldval() {
        return oldval;
    }

    public void setOldval(String oldval) {
        this.oldval = oldval;
    }

    public String getNewVal() {
        return newVal;
    }

    @Override
    public String toString() {
        return "AuditDetailDto{" +
                "delta='" + delta + '\'' +
                ", oldval='" + oldval + '\'' +
                ", newVal='" + newVal + '\'' +
                '}';
    }

    public void setNewVal(String newVal) {
        this.newVal = newVal;
    }

    private String  oldval;
    private String  newVal;


}
