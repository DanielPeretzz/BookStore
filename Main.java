package com.homework.daniel;

import com.homework.daniel.Model.AdvancedBookStore;
import com.homework.daniel.Model.Book;
import com.homework.daniel.Model.BookStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static BookStore bookStore = new BookStore();
   static AdvancedBookStore advancedBookStore = new AdvancedBookStore();
   public static Book book1 = new Book("harry potter", 10);
   public static Book book2 = new Book("game of thrones",10);
   public static Book book3 = new Book("hand of god",10);
   public static Book book4 = new Book("star wars",10);

    public static void main(String[] args) {

        System.out.println("BookStore : ");
        bookStore.fillStock(book1.getTitle(),5);
        bookStore.fillStock(book2.getTitle(),10);
        bookStore.fillStock(book3.getTitle(),12);
        bookStore.fillStock(book4.getTitle(),1);
        System.out.println(bookStore.getBooksInStock());
        bookStore.purchase(book1.getTitle(),2);
        System.out.println(bookStore.getBooksInStock());


        System.out.println();
    /////////////////////////&&AdvancedBookStore&&//////////////////////////////
        System.out.println();
        System.out.println("AdvancedBookStore : ");
        advancedBookStore.fillStock(book1,5);
        System.out.println(advancedBookStore.getBooksInStock());
        System.out.println("total cash after Tax(30%) : " + advancedBookStore.getCashInRegistry() + "$");











    }
}


