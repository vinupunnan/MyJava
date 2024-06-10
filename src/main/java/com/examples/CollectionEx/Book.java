package com.examples.CollectionEx;

public class Book {
    private int price;
    private String name;

    private int noOfPages;

    private String subject;

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", noOfPages=" + noOfPages +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Book(int price, String name, int noOfPages, String subject) {
        this.price = price;
        this.name = name;
        this.noOfPages = noOfPages;
        this.subject = subject;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
