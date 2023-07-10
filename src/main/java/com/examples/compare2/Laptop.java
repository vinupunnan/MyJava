package com.examples.compare2;

public class Laptop implements Comparable<Laptop> {
    private String brandName;
    private Integer price;

    @Override
    public String toString() {
//        return "Laptop{" +
//                "brandName='" + brandName + '\'' +
//                ", price=" + price +
//                ", ram=" + ram +
//                '}';
        return "test";
    }

    private Integer ram;

    public Laptop(String brandName, Integer price, Integer ram) {
        this.brandName = brandName;
        this.price = price;
        this.ram = ram;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
    @Override
       public int compareTo(Laptop laptop) {
        if(this.getPrice() >laptop.getPrice()){
            return 1;
        }
        if(this.getPrice() < laptop.getPrice()){
            return -1;
        }
        if(this.getPrice() == laptop.getPrice()){
            return 0;
        }
        return 0
;    }



}
