package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Song transfered = new Song();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the artist of your favorite song!");
        transfered.band = scanner.nextLine();

        System.out.println("Please enter the title of your favorite song!");
        transfered.title = scanner.nextLine();

        System.out.println("Please enter the length of your favorite song in minutes!");
        transfered.lenght = scanner.nextInt();

        System.out.println("Data request successful!");
        System.out.println("Artist: " + transfered.band);
        System.out.println("Title: " + transfered.title);
        System.out.println("Lenght: " + transfered.lenght + " min");
    }
}
