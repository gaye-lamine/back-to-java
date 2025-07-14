package lamine.net.Utils;

import com.google.gson.Gson;
import lamine.net.Book;

import java.util.List;

public class Utils {
    public void ListToJson(List<Book> books){
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        String json = gson.toJson(books);
        System.out.println(json);
    }
}
