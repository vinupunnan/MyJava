package com.examples.inter;

import com.examples.compare.Student;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    List<Book> bookList = new ArrayList<>();
    MyClass(){
       bookList.add(new StudentA());
       bookList.add(new StudentB());
    }


}
