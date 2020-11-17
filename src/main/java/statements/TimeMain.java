package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the hour value for the first time:");
        int firstHours = scanner.nextInt();
        System.out.println("Please enter the minute value for the first time:");
        int firstMinutes = scanner.nextInt();
        System.out.println("Please enter the secunds value for the first time:");
        int firstSeconds = scanner.nextInt();

        System.out.println("");
        System.out.println("Please enter the hour value for the second time:");
        int secondHours = scanner.nextInt();
        System.out.println("Please enter the minute value for the second time:");
        int secondMinutes = scanner.nextInt();
        System.out.println("Please enter the secunds value for the second time:");
        int secondSeconds = scanner.nextInt();

        Time firstTime = new Time(firstHours, firstMinutes, firstSeconds);
        Time secondTime = new Time(secondHours, secondMinutes, secondSeconds);

        System.out.println("");
        System.out.println("The first time: " + firstTime.toString() + " ==> in minutes = " + firstTime.getInMinutes() + " min");
        System.out.println("The second time: " + secondTime.toString() + " ==> in seconds = " + secondTime.getInSeconds() + " seconds");
        System.out.println("Is the first time earlier than the second? ==> " + firstTime.earlierThan(secondTime));      //firstTimera kell meghívni a earlierThen metódust, mert akkor az lesz a this. és a paraméterben megadott meg a másik!
    }
}
