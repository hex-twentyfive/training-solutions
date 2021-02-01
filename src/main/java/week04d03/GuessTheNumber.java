package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

/*  Írj egy számkitaláló programot a GuessTheNumber osztályba! A program kitalál egy véletlenszerű számot
    1 és 100 között. Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám,
    kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.
    Bónusz feladat: max 6-szor lehet kérdezni!
*/

    public void guessTheNumber() {
        int thoughtNumber = new Random().nextInt(99)+1;
        System.out.println("Gondoltam egy egész számra 1 és 100 között!");
        boolean theNumberIsFound = false;
        for (int i = 0; i<6; i++) {
            System.out.println("Mi a tipped, mire gondoltam?" + " --► (Még " + ( 6 - i ) + " próbálkozásod van hátra!)");
            int requestedNumber = new Scanner(System.in).nextInt();
            if (thoughtNumber < requestedNumber ) {
                System.out.println("Nem talált, a gondolt szám kisebb! ▼");
            }
            else if (thoughtNumber > requestedNumber) {
                System.out.println("Nem talált, a gondolt szám nagyobb! ▲");
            }
            else if (thoughtNumber == requestedNumber) {
                System.out.println("Ez az erre a számra gondoltam! Gratulálok! " + " (A szükséges próbálkozásaid száma: " + ( i + 1 ) + ")");
                theNumberIsFound = true;
                break;
            }
        }
        if (theNumberIsFound == false) {
            String thoughtNumberColoring = "[34m" + thoughtNumber;
            System.out.println("Sajnálom, nem sikerült kitalálnod a számot!" + " A gondolt szám a " + "\u001B[34m" + thoughtNumber + "\u001B[0m" + " volt.");
        }
    }


    public static void main(String[] args) {
        GuessTheNumber access = new GuessTheNumber();
        access.guessTheNumber();
    }

}