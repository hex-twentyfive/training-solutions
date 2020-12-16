package objectclass;

import java.util.Objects;

public class Book {

    private String author;
    private String tittle;

    public Book(String author, String tittle) {
        this.author = author;
        this.tittle = tittle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(tittle, book.tittle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, tittle);
    }
}
