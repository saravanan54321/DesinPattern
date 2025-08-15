package org.example.Behaviouralpattern.IteratorPattern.badcode;

import java.util.ArrayList;
import java.util.List;

public class BookContainer {


    private List<Book>  bookContainer = new ArrayList<>();

    public void addBook(Book book){
        bookContainer.add(book);
    }

    public  List<Book> getList(){
        return bookContainer;
    }
}
