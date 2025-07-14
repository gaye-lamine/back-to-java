package lamine.net;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public List<Book> display(){
        List<Book> books = new ArrayList<>();
        books.add(this);
        return books;

    }

    /*
     * Method for filter by category
     * @return List<Book>
     *@param String, List<Book>
     */
    public List<Book> filterByCategory(String category, List<Book> booksFiltered){
        return booksFiltered.stream().filter(book -> book.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());


    }


    /*
     * Method for to sort price by croissant order
     * @return List<Book>
     *  */

    public List<Book> sorterByCroissantPrice(List<Book> sortedList){
        return  sortedList
                .stream()
                .sorted(Comparator.comparingDouble(Book::getPrice).reversed())
                .toList();
    }

    public List<String> getAllTitles(List<Book> books){
        return books.stream()
                .map(
                        Book::getTitle
                ).toList();

    }

    public Book cheaperbook(List<Book> allBooks){
        Book result= allBooks
                .stream()
                .min(
                        Comparator.comparingDouble(book -> getPrice())
                ).get();
        if (result!=null){
            return result;
        }else{
            return null;
        }
    }

    public boolean existsBookByAuthor(List<Book> books, Author author){
        return books.stream()
                .anyMatch(
                        book -> book.getAuthor().equals(author)
                );
    }

    public Map<String, List<Book>> groupByCategory(List<Book> books){
        return books.stream()
                .collect(
                        Collectors.groupingBy(
                                Book::getCategory
                        )
                );
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
public String toString(){
    Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
    String json = gson.toJson(this);
    return json;
}

public double getTotalePrice(List<Book> books){
    return books.stream().mapToDouble(Book::getPrice).sum();
}


}
