package behaviouralDesignPattern.iteratorDesignPattern.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class BookCollection {
    public List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
