package com.examples.inter;

import java.util.List;

public class MyClassExceuter {
    public static void main(String args[]){
       MyClass test = new MyClass();
       List<Book> listTest  = test.bookList;
       for(Book b :listTest){
           b.read();
           b.write();
       }
    }

}
