package com.homework.daniel.Model;

import com.homework.daniel.Exception.OutOfStockException;

import java.util.HashMap;
import java.util.Map;

public class BookStore {


    private final Map<String, Integer> booksInStock;
    private int cashInRegistry;

    public BookStore() {
        this.booksInStock = new HashMap<>();;
        this.cashInRegistry = 0;
    }



    public void purchase(String title,int amount){
        try {
            Integer amt = this.booksInStock.get(title);
            if (amt != null && amount <= amt){
                this.booksInStock.put(title, amt - amount);
            } else {
                throw new OutOfStockException(title + " is out of stock");
            }
        }catch (Exception e){
            System.out.println("A problem : " + e);
        }
    }

    public void fillStock(String title, int amount){
        Integer amt = this.booksInStock.get(title);
        if (amt != null){
            booksInStock.put(title, amt + amount);
        }
        if (amt == null){
            booksInStock.put(title,amount);
        }
    }

    public Map<String, Integer> getBooksInStock() {
        return booksInStock;
    }

    public int getCashInRegistry() {
        return cashInRegistry;
    }
}