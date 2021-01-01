package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    /*  Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy (winnersGenerator)
        getNumbers(int interval, int numbers) metódusa, ami visszaad egy listát amiben
        (5 véletlen szám van 1-90 között) numbers mennyiségű véletlen szám van 1-interval között,
        tehát kvázi készíts egy lottósorsoló programot. A sorrendre nem kell figyelni, a lényeg,
        hogy a számok különbözők legyenek!
    */

    public static List<Integer> getNumbers(int interval, int numbers) {

        List<Integer> randomNumberList = new ArrayList<>();

        while (randomNumberList.size() < numbers) {
            int rnd = new Random().nextInt(interval) + 1;
            if (!randomNumberList.contains(rnd)) {
               randomNumberList.add(rnd);
            }
        }

    return randomNumberList;
    }

}
