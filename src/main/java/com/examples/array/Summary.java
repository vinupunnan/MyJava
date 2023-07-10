package com.examples.array;

public class Summary {
    public  String audit ;
    public  Object[] key;

    public Summary(String audit, Object... key){
        this.audit = audit;
        this.key = key;
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public Object[] getKey() {
        return key;
    }

    public void setKey(Object[] key) {
        this.key = key;
    }
}
