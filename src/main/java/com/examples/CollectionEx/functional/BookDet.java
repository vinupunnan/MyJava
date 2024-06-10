package com.examples.CollectionEx.functional;

public class BookDet {
    private  String bookName;
    private int price;
    private int noOfPages;
    private String category;

    public BookDet(String bookName, int price, int noOfPages, String category) {
        this.bookName = bookName;
        this.price = price;
        this.noOfPages = noOfPages;
        this.category = category;
    }

    @Override
    public String toString() {
        return "BookDet{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", noOfPages=" + noOfPages +
                ", category='" + category + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}


