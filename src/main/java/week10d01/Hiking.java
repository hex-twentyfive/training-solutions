package week10d01;

import java.util.List;

public class Hiking {

/*  Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat,
    valamint a magasságot (mindegyik lebegőpontos érték). Írj a week10d01.Hiking osztályba
    egy getPlusElevation() metódust, mely megkapja a magasságok listáját, és visszaadja a
    emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15).
    A 20 méterről 15 méterre ereszkedést nem számolja bele, hiszen az ereszkedés, és nem emelkedés.
*/

    public static double getPlusElevation(List<Double> elevations) {
        double sumClimb = 0.0;
        for (int i = 1; i < elevations.size(); i++) {
            if (elevations.get(i-1) < elevations.get(i)) {
                    sumClimb += elevations.get(i) - elevations.get(i-1);
                }
            }
        return sumClimb;
    }

}
