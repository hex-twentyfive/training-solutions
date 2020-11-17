package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nKérem válasszon a menük között!");
        int listSelectionNumber = scanner.nextInt();

        if ( listSelectionNumber == 1 ) {
            System.out.println("Felhasználók listázása");
        }else if ( listSelectionNumber == 2 ) {
            System.out.println("Felhasználó felvétele");
        } else {
            System.out.println("Kilépés");
        }

    }
}
