package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {

        Book bookTransfer = new Book("Stephen Hawking", "Az idő rövid története");

        bookTransfer.register("#0001");

        System.out.println("The registered title of the book: " + bookTransfer.getTittle());
        System.out.println("The registered author of the book: " + bookTransfer.getAuthor());
        System.out.println("The registration number of the book: " + bookTransfer.getRegNumber());
    }
 }