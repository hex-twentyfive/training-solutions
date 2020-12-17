package week07d02;

public class DigitSum {

     /* Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metódus, mely visszaadja a paraméterül kapott szám számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6. */

    public static int sumOfDigits(int x) {
        String xString = Integer.toString(x);
        int sumOfDigitsOfTheNumber = 0;
        for (int i=0 ; i < xString.length(); i++) {
            sumOfDigitsOfTheNumber += Integer.parseInt(xString.substring(i, i+1));
        }
        return sumOfDigitsOfTheNumber;
    }

}
