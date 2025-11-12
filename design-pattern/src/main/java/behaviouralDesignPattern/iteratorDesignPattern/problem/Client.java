package behaviouralDesignPattern.iteratorDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 12/11/25, Wednesday
 **/

public class Client {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("Design Patterns"));
        collection.addBook(new Book("Clean Code"));
        collection.addBook(new Book("Effective Java"));

        for (Book book : collection.getBooks()) {
            System.out.println(book);
        }
    }
}
