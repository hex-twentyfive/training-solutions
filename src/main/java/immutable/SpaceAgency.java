package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {                    //Regisztrálni lehet az útjukra indított eszközöket
        if (satellite == null) {                                            //a szatellit regisztrációnál nem kaphat null paramétert
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {       //és azonosítójuk alapján ki is lehet keresni
        if (isEmpty(registerIdent)) {                                               //Üres String, mint paraméter nem fogadható el,
            throw new IllegalArgumentException("RegisterIdent must be given!");
        }

        Satellite satellite = null;
        for (Satellite element : satellites) {
            if (element.getRegisterIdent().equals(registerIdent)) {
                satellite = element;
            }
        }

        if (satellite == null) {                                                // Amennyiben a megadott azonosítóval nem található űreszköz, szintén kivételt várunk.
            throw new IllegalArgumentException("Satellite with the given registration cannot be found! --> " + registerIdent);
        }

        return satellite;

    }

    @Override
    public String toString() {
        String satellitesListString = "[";
        for (Satellite element : satellites) {
            satellitesListString = satellitesListString + element.toString() + ", ";
        }
        satellitesListString = satellitesListString.substring(0, satellitesListString.length() - 2);
        satellitesListString = satellitesListString + "]";
        return satellitesListString;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

}
