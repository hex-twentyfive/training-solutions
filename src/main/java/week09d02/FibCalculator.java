package week09d02;

public class FibCalculator {

/* készíts egy osztályt FibCalculator néven. Ennek legyen egy metódusa long sumEvens(int bound) néven.
   Ennek a metódusnak a feladata az, hogy összeadja a páros fibonacci számokat addig,
   amig a következő fibonacci szám nem nagyobb, mint bound, majd visszadja a végredményt.
*/

    public long sumEvens(int bound) {
        long sum = 0;
        long num1 = 0;
        long num2 = 1;
        do {
            if (num2 % 2 == 0) {
                sum += num2;
            }
            long num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        } while (num2 < bound);
        return sum;
    }

}

