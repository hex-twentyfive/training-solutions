package attributes.book;

public class BookMain {

    public static void main(String[] args) {

        Book instBook = new Book("The Lord of The Rings");

        System.out.println(instBook.getTitle());

        instBook.setTitle("The Hobbit");

        System.out.println(instBook.getTitle());
    }
}
