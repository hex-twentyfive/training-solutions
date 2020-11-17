package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a username!");
        String userName = scanner.nextLine();

        System.out.println("Please enter a password!");
        String password1 = scanner.nextLine();

        System.out.println("Please confirm the password!");
        String password2 = scanner.nextLine();

        System.out.println("Please enter an e-mail!");
        String email = scanner.nextLine();

        UserValidator validation = new UserValidator();

        System.out.println("");
        System.out.println("Validation is complete!");
        System.out.println("Username ==> " + (validation.isValidUsername(userName) ? "The username is correct!" : "Invalid username!" ) );
        System.out.println("Password ==> " + (validation.isValidPassword(password1, password2) ? "The password is correct!" : "Invalid password!" ) );
        System.out.println("E-mail ==> " + (validation.isValidEmail(email) ? "The e-mail is correct!" : "Invalid e-mail!" ) );

    }
}
