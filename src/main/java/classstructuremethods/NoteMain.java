package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note clientTransfer = new Note();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name!");
        clientTransfer.setName(scanner.nextLine());

        System.out.println("Please specify a topic!");
        clientTransfer.setTopic(scanner.nextLine());

        System.out.println("Please enter the text of the topic!");
        clientTransfer.setText(scanner.nextLine());

        System.out.println("The entry is registered!");
        System.out.println(clientTransfer.getNoteText());
    }
}
