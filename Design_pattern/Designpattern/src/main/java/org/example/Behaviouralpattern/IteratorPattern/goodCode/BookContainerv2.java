package org.example.Behaviouralpattern.IteratorPattern.goodCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookContainerv2 implements  Iterable<Book> {


    private List<Book> books = new ArrayList<>();

    public  void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        // list, set having predefined iterator method
        // this will give the iterator object
        return books.iterator();
    }




}
