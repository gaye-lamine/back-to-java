package lamine.net;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Book {
    private String isbn;
    private String title;
    private String category;
    private Author author;
    private double price;
    public Book(){}
    public Book(String isbn, String title, String category, Author author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public String getIsbn() {
        return isbn;
    }

    public ArrayList<Book> display(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(this);
        return books;

    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }




}
