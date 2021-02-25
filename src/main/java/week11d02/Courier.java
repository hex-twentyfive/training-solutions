package week11d02;

import java.util.ArrayList;
import java.util.List;

/*  A feladatban egy biciklis futár egy heti munkáját rögzítjük és készítünk statissztikákat.
    A futár minden fuvar után feljegyzi, hogy a hét hányadik napján történt a fuvar.
    Ezután azt, hogy az adott nap hányadik fuvarját teljesítette és ezután azt,
    hogy hány kilométer volt az adott fuvar.
    A futár egy-egy fuvarját reprezentálja a Ride nevű osztály, adatagokkal, konstruktorra, getterekkel.
    Készítsd el a Courier osztályt. Ez fogja a futárt reprezentálni. Legyen egy rides listája ami fuvarokat tárol.
    Legyen egy addRide metódus, ami csak sorrendben enged hozzáadni elemeket a listához. Figyeljünk viszont arra,
    hogy nem feltétlenül minden nap dolgozott a futár, de ha már bekerült egy 3. napi fuvar,
    akkor ne kerülhessen be egy 2. napi. És arra is figyelj, hogy a napon belül is sorrendben kerüljenek be az adatok.
    Ha a paraméterül kapott Ride nem felel meg a feltételeknek dobjunk IllegalArgumentException-t.
      pl. egy helyes listára: 1 1 12 1 2 11 2 1 10 4 1 19
    Készíts egy metódust, ami visszad egy napot amikor a futár nem dolgozott.
    Ha több ilyen nap is van akkor a korábbit!
*/

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(int dayOfFreight, int dailyFreightNumber, int freightDistance) {
        if (dayOfFreight <= 0 || dailyFreightNumber <= 0) {
            throw new IllegalArgumentException("The day or the number of freight can not be null!");
        }
        for (Ride e: rides) {
            if (e.getDayOfFreight() == dayOfFreight & e.getDailyFreightNumber() > dailyFreightNumber
                    || e.getDayOfFreight() == dayOfFreight & e.getDailyFreightNumber() == dailyFreightNumber
                    || e.getDayOfFreight() > dayOfFreight) {
                throw new IllegalArgumentException("The time to be added cannot be earlier!");
            }
        }
        rides.add(new Ride(dayOfFreight,dailyFreightNumber,freightDistance));
    }

    public int dayWithoutWork() {
        int register = 0;
        for (Ride e: rides) {
            if (register == 0 & e.getDayOfFreight() > 1) {
                return 1;
            } else if (register == 0) {
                register = e.getDayOfFreight();
            } else if (e.getDayOfFreight() > register + 1) {
                return register + 1;
            } else {
                register ++;
            }
        }
        return -1;
    }

    public List<Ride> getRides() {
        return rides;
    }

}