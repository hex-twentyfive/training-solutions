package finalmodifer;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circle = new CircleCalculator();
        CylinderCalculator circle2 = new CylinderCalculator();

        System.out.println("A Pi értéke: " + CircleCalculator.PI);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg egy kör sugarát! ");
        double r1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nA kör kerülete: " + circle.calculatePerimeter(r1) + " egység.");
        System.out.println("A kör területe: " + circle.calculateArea(r1) + " egységnégyzet.");

        System.out.println("\nKérem adjon meg egy magassági értéket! ");
        double h1 = scanner.nextInt();

        System.out.println("\nA körre emelt, adott magasságú henger felszíne: " + circle2.calculateSurfaceArea(r1, h1) + " egységnégyzet.");
        System.out.println("A henger térfogata: " + circle2.calculateVolume(r1, h1) + " egység a köbön.");
    }

}
