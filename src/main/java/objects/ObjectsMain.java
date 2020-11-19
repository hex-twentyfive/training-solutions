package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());

        Book emptyBook = new Book();
        System.out.println(emptyBook);

        emptyBook = null;
        System.out.println("\n" + emptyBook);

        if (emptyBook == null) {
            System.out.println("Based on the test, the value of the emptyBooks variable is \'null\'! ");
        }

        Book book = new Book();
        System.out.println("\n" + book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(book == anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);

        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> books2 = Arrays.asList(new Book(),new Book(), new Book());
        List<Book> books3 = new ArrayList<>();

        books3.add(new Book());
        books3.add(new Book());
        books3.add(new Book());
    }
}
