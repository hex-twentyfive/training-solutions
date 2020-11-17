package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int inputNumber = scanner.nextInt();

        if ( inputNumber > 100 ) {
            System.out.println("\nA kapott szám nagyobb, mint 100!");
        } else {
            System.out.println("\nA kapott szám kisebb, mint 100!");
        }

    }
}
