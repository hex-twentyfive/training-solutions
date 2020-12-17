package week07d01;

public class MathAlgorithms {

/*    Készíts egy osztályt a week07d01 csomagba MathAlgorithms néven. Ebben az osztályban legyen egy isPrime(int x) metódus ami a paraméterül kapott számról eldönti,
    hogy prím-e vagy sem és ennek megfelelően true vagy false értékkel tér vissza. Aki már tart ott, és tudja, hoigy mit jelent a static, az nyugodtan implementálhatja a metódust statikus metódusként.
    Az egyszerűség kedvéért a prímeket most csak a pozitív egész szűáámok körében értelmezzük, így bónuszként rá lehet ellenőrizni, hogy x>0 és ha nem akkor kívételt dobni.
    Prímeknek tekintjük azokat a számokat, melyek csak egyel és önmagukkal oszthatók. Tehát a 2,3,5,7,11,13 stb. Teszt_!
    Prímeknek tekintjük azokat a számokat, amelyeknek pontosan két osztólyuk van! */

    public static boolean isPrime(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("The value of the number cannot be negative!");
        } else if (number < 1) {
            throw new IllegalArgumentException("Wrong parameter!");
        } else {
            int numberOfDivisors = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors == 2) {
                return true;
            }
        }
        return false;
    }

}
