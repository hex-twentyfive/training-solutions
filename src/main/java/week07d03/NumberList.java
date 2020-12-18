package week07d03;

import java.util.List;

public class NumberList {

    /* A week07d03 csomagban hozz létre egy NumberList osztályt. Ennek legyen egy metódusa
        isIncreasing(List<Integer>) mely egy számokból álló listát vár paraméterül és megnézi,
        hogy a listában a számok növekvő sorrendben szerepelnek-e és ennek megfelelően igaz,
        vagy hamis értékkel tér vissza. Speciális eset, ha két egymást követő szám egyenlő,
        ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük. */

    public static boolean isIncreasing(List<Integer> numbers) {

        int previousNumber = 0;

        for (Integer element: numbers) {
            if ( previousNumber == 0 ) {
                previousNumber = element;
            }
            else if ( previousNumber > element ) {
                return false;
            }
            else {
                previousNumber = element;
            }
        }
        return true;
    }

}
