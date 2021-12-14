package com.homework.daniel.Model;

import com.homework.daniel.Constants.BookStoreConstants;
import com.homework.daniel.Exception.OutOfStockException;

import java.util.*;

public class AdvancedBookStore {

    private final Map<String, List<Book>> booksInStock;
    private double cashInRegistry;

    public AdvancedBookStore() {
        this.booksInStock = new HashMap<>();;
        this.cashInRegistry = 500;
    }

    public void fillStock(Book book, int amount) {
            List<Book> bookList = new ArrayList<>();
            bookList.add(book);
            booksInStock.put(book.getTitle(), bookList);
        for (int i = 0; i < booksInStock.size() ; i++) {
            if (booksInStock.get(book.getTitle()) != null){
                this.cashInRegistry -= (book.getPrice() - (book.getPrice() * 0.30f)) * amount;
                return;
            }
        }
    }

    public Map<String, List<Book>> getBooksInStock() {
        return booksInStock;
    }

    public double getCashInRegistry() {
        return cashInRegistry;
    }
}



