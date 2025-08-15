package org.example.Behaviouralpattern.IteratorPattern.goodCode;


import java.util.Iterator;

public class Clientv2 {

    public static void main(String[] args) {

        BookContainerv2 bc = new BookContainerv2();
        bc.addBook(new Book("java"));
        bc.addBook(new Book("python"));
        bc.addBook(new Book("c++"));


       Iterator<Book> iterator = bc.iterator();
       while (iterator.hasNext()){
           Book book = iterator.next();
           System.out.println(book);
       }


    }
}
