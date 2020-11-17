package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer!");

        int inputInteger = scanner.nextInt();

        System.out.println("Is the received number divisible by three? ==> " + (( inputInteger % 3 ) == 0 ? "Yes divisible" : "Not divisible"));

    }
}
