package lamine.net;

import lamine.net.Utils.Utils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Créer 5 auteurs
        Author author1 = new Author();
        author1.setFirstname("Lamine");
        author1.setLastname("Gaye");

        Author author2 = new Author();
        author2.setFirstname("Amadou");
        author2.setLastname("Sow");

        Author author3 = new Author();
        author3.setFirstname("Fatou");
        author3.setLastname("Diop");

        Author author4 = new Author();
        author4.setFirstname("Ousmane");
        author4.setLastname("Ndoye");

        Author author5 = new Author();
        author5.setFirstname("Mariam");
        author5.setLastname("Ba");

        // Créer 10 livres répartis entre les auteurs
        List<Book> books = new ArrayList<>();

        books.add(new Book("ISBN001", "Java for Beginners", "Programming", author1, 29.99));
        books.add(new Book("ISBN002", "Advanced Java", "Programming", author1, 39.99));

        books.add(new Book("ISBN003", "Poèmes du Sahel", "Poetry", author2, 19.50));
        books.add(new Book("ISBN004", "Nouvelles Africaines", "Literature", author2, 22.00));

        books.add(new Book("ISBN005", "Cooking Sénégal", "Cooking", author3, 15.75));
        books.add(new Book("ISBN006", "Healthy Recipes", "Cooking", author3, 18.30));

        books.add(new Book("ISBN007", "History of Senegal", "History", author4, 25.00));
        books.add(new Book("ISBN008", "African Kingdoms", "History", author4, 28.40));

        books.add(new Book("ISBN009", "Children’s Tales", "Kids", author5, 12.99));
        books.add(new Book("ISBN010", "Women in Literature", "Literature", author5, 21.50));

        // Affichage simple
        Utils utils = new Utils();
        utils.ListToJson(books);

        // Créer 2 utilisateurs
        User user1 = new User(UUID.randomUUID().toString(), "Alpha Diallo");
        User user2 = new User(UUID.randomUUID().toString(), "Sophie Ndiaye");

        // Utilisateur 1 emprunte 3 livres
        user1.borrowBook(books.get(0)); // Java for Beginners
        user1.borrowBook(books.get(3)); // Nouvelles Africaines
        user1.borrowBook(books.get(6)); // History of Senegal

        // Utilisateur 2 emprunte 2 livres
        user2.borrowBook(books.get(5)); // Healthy Recipes
        user2.borrowBook(books.get(8)); // Children’s Tales

        System.out.println("\nLivres empruntés par " + user1.getName() + ":");
        for (Book b : user1.getBorrowedBooks()) {
            System.out.println(b.getTitle());
        }

        System.out.println("\nLivres empruntés par " + user2.getName() + ":");
        for (Book b : user2.getBorrowedBooks()) {
            System.out.println(b.getTitle());
        }
    }
}
