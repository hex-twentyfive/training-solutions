package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot!");
        int inputNumber1 = scanner.nextInt();

        System.out.println("Kérem az második számot!");
        int inputNumber2 = scanner.nextInt();

        System.out.println("Kérem az harmadik számot!");
        int inputNumber3 = scanner.nextInt();

        System.out.println("Kérem az negyedik számot!");
        int inputNumber4 = scanner.nextInt();

        System.out.println("Kérem az ötödik számot!");
        int inputNumber5 = scanner.nextInt();

        int sum = inputNumber1 + inputNumber2 + inputNumber3 + inputNumber4 + inputNumber5;

        System.out.println("\n" + inputNumber1 + " + " + inputNumber2 + " + " + inputNumber3 + " + " + inputNumber4 + " + " + inputNumber5 + " = " + sum );

    }
}
