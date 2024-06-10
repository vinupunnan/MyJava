package com.examples.CollectionEx.functional;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public static List<BookDet> getBooks(){
        List<BookDet> bookList = new ArrayList<>();
        BookDet d1 = new BookDet("Mat",  200, 340,  "Maths");
        BookDet d2 = new BookDet("Eng",  222, 330,  "EngLish");
        BookDet d3 = new BookDet("Chem",  240, 5000,  "Chemistry");
        BookDet d4 = new BookDet( "Bio",  200, 340,  "Biology");
        bookList.add(d1);
        bookList.add(d2);bookList.add(d3);bookList.add(d4);
        return bookList;



    }
}
