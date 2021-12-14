package com.homework.daniel.Model;

public class Book {
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    private String title;
    public int price;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}