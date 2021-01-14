package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

/*    2021-01-05
    Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember
    fel akar szállni. A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember,
    3-asban egy ember, 4-esben 2 ember akar felszállni. A MaxTravel osztály getMaxIndex() metódusa adja vissza,
    hogy hanyas megállóban szeretnének a legtöbben felszálln! Maximum 30 megálló lehet.

    Leegyszerűsítve a feladat az, hogy a paraméterként átadott tömbben keresse meg, hogy melyik szám szerepel a legtöbbször.
*/

    public static String getMaxIndex(List<Integer> busStations) {
        if (busStations.size() > 30) {
            throw new IllegalArgumentException("The maximum number of items in the list is 30!");
        }
        else if (busStations.size() == 0) {
            throw new IllegalArgumentException("The number of items in the list cannot be zero!");
        }

        int maxNumberOfPassengers = 0;
        int topStation = 0;
        int innerCounter =0;

        for (int referenceNumber: busStations) {
            for (int element: busStations ) {
                if (element == referenceNumber) {
                    innerCounter ++;
                }
            }
            if (innerCounter > maxNumberOfPassengers) {
                maxNumberOfPassengers = innerCounter;
                topStation = referenceNumber;
            }
            innerCounter = 0;
        }
    return "The most frequently used station -> Station " + topStation + " \nwhere the number of passengers -> " + maxNumberOfPassengers;
    }


}
