package week11d01;

public class DivisorFinder {

/*    2021-01-11
    Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa. A feladat az,
    hogy megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak, majd számoljuk össze őket.
    Példa: a 425-ben az 5 osztója a számnak, ezért a visszatérési érték 1.
*/

    public static int findDivisors(int n) {

        int divisorCounter = 0;

        String number = Integer.toString(n);
        String[] vágmány = number.split("");

        for (String element: vágmány) {
            int numberedElement = Integer.parseInt(element);
            if (numberedElement != 0) {
                if (n % numberedElement == 0) {
                    divisorCounter++;
                }
            }
        }
        return divisorCounter;
    }


}
