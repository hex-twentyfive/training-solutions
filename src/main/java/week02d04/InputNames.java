package week02d04;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem gépeljen be egymás után 5 nevet!");

        String[] nameArray = new String[5];

        for ( int i = 0 ; i < nameArray.length ; i++ ) {
            System.out.println("Név " + (i + 1) + ". : ");
            nameArray[i] = scanner.nextLine();
        }

        System.out.print("\nA név tömb tartalma: ");
        for ( int i = 0 ; i < nameArray.length ; i++) {
            System.out.print("\n" + (i+1) + ". " + nameArray[i]);
        }
        System.out.println("\n");

    }

}
