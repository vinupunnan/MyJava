package com.examples.CollectionEx.functional;

import java.util.Collections;
import java.util.List;

public class FunctionalSort {
    public static void main (String args[]) throws Exception{
        List<BookDet> bookDetList = BookDao.getBooks();
        Collections.sort(bookDetList,(o1,o2)->o1.getBookName().compareTo(o2.getBookName()));

        System.out.println(bookDetList);
    }
}
