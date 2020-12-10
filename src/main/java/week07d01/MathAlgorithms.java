package week07d01;

public class MathAlgorithms {


    public static boolean isPrime(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("The value of the number cannot be negative!");
        } else if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
