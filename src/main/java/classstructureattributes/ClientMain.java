package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client transfered = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name!");
        transfered.name = scanner.nextLine();


        System.out.println("Please enter your year of birth!");
        transfered.year = scanner.nextInt();
        scanner.nextLine();     //Technikai beolvasás, az enter beolvasásához!

        System.out.println("Please enter your current address!");
        transfered.address = scanner.nextLine();

        System.out.println("The registration is complete!");
        System.out.println("Name: " + transfered.name);
        System.out.println("Year of birth: " + transfered.year);
        System.out.println("Address: " + transfered.address);

    }
}
