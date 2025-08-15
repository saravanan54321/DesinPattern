package org.example.Behaviouralpattern.IteratorPattern.badcode;

public class Clientv1 {

    public static void main(String[] args) {
        BookContainer bc = new BookContainer();
        bc.addBook(new Book("java"));
        bc.addBook(new Book("python"));
        bc.addBook(new Book("c++"));

        for(int i =0 ; i<bc.getList().size();i++){
            System.out.println(bc.getList().get(i));

        }




    }
}
