package lamine.net;

import java.util.List;
import java.util.UUID;

public class Author {
    private String id;
    private String firstname;
    private String lastname;

    public Author(){
        this.id = UUID.randomUUID().toString();
    }
    public String getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getFullName(){
        return firstname + " " + lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Author> uniqueAuthors(){
        List<Author> authors = List.of(this);
        return authors.stream().distinct().toList();
    }
}

