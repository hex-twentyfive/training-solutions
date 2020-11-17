package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name!");
        String inputName = scanner.nextLine();

        System.out.println("Please enter your e-mail!");
        String inputEmail = scanner.nextLine();

        System.out.println("The registration is complete!");
        System.out.println("Name: " + inputName);
        System.out.println("E-mail: " + inputEmail);
        System.out.println("Hello " + inputName + " Have a nice day!");
    }
}
