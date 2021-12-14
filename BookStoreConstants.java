package com.homework.daniel.Constants;

public class BookStoreConstants {
    static BookStoreConstants bookStoreConstants = new BookStoreConstants();
    private BookStoreConstants() {} // Private constructor to prevent object instantiation as it is a constants class

    public static BookStoreConstants getInstance(){
        return bookStoreConstants;
    }
    public static final float STOCK_PRICE_FACTOR = 0.30f;


}