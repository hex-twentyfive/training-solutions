package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

/*  A week08d05 csomagban készíts egy osztályt MathAlgorithms néven. Legyen benne egy metódus,
    greatestCommonDivisor(), ami paraméterül vár két pozitív egész számot és visszaadja a
    legnagyobb közös osztójukat.
*/

    public int greatestCommonDivisor(int a, int b) {
        List<Integer> divisor = getCommonDivisors(a, b);
        int greatestCommonDivisor = 1;
        for (int i = 1; i < divisor.size(); i++) {
            if (divisor.get(i) > greatestCommonDivisor) {
                greatestCommonDivisor = divisor.get(i);
            }
        }
        return greatestCommonDivisor;
    }

    private List<Integer> getCommonDivisors(int a, int b) {
        List<Integer> allCommonDivisors = new ArrayList<>();
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                allCommonDivisors.add(i);
            }
        }
        return allCommonDivisors;
    }

}
