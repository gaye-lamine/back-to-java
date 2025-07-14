package lamine.net;

import java.util.ArrayList;

public class User {
    private String id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public User(String id, String name){
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setName(String name) {
        this.name = name;
    }

    /*
     * emprunter livre
     */
    public  void borrowBook(Book book){
        this.borrowedBooks.add(book);
    }

    /*
    * retourner livre
     */
    public void returnBook(Book book){
        this.borrowedBooks.remove(book);
    }
}
