package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an arbitrary number!");
        int inputNumber1 = scanner.nextInt();

        System.out.println("Please enter an othet arbitrary number!");
        int inputNumber2 = scanner.nextInt();

        System.out.println(inputNumber1 + " + " + inputNumber2);
        int addedNumber = inputNumber1 + inputNumber2;

        System.out.println("= " + addedNumber);
    }
}
