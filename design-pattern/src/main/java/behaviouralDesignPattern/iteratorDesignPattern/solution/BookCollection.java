package behaviouralDesignPattern.iteratorDesignPattern.solution;

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

    public Iterator<Book> iterator() {
        return new BookIterator(this.books);
    }

//    Nested Class
    private class BookIterator implements Iterator<Book> {

        private final List<Book> books;

        private int index = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            return books.get(index++);
        }
    }

}
