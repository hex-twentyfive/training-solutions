package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

/*  Adott egy fájl melyben egy reptér egy napi munkáját rögzítettük. Adott egy járatszám.
    Az, hogy érkező vagy felszálló gépről van-e szó. A kiinduló/cél város,
    attól függöen hogy indul vagy érkezik-e a gép és a felszállás/leszállás pontos ideje.
    1. Olvasd be a fájl tartalmát a memóriába.
    2. Határozd meg, hogy induló vagy érkező járatból volt-e több.
    3. Legyen egy metódus ami járatszám alapján ad vissza egy járatot.
    4. Írj egy metódust ami bekér egy várost és azt, hogy az induló vagy érkező járatokat szeretnénk-e.
       És egy Listába adjuk viassza az összes abba a városba induló vagy érkező repülőt.
    5. Adjuk vissza a legkorábban induló repülőt!
    Fájl: https://github.com/Training360/strukturavalto-java-public/blob/master/examples/week13d02/src/main/resources/cities.txt
 */

    private List<Flight> flyingSchedule = new ArrayList<>();

    public void readFile(String fileLocation) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileLocation)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                fillFlightScheduleByValues(splitLine);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public void fillFlightScheduleByValues(String[] splitLine) {
        String planeID = splitLine[0];
        Status flightStatus = Status.valueOf(splitLine[1]);
        String city = splitLine[2];
        String[] splitTime = splitLine[3].split(":");
        LocalTime time = LocalTime.of(Integer.parseInt(splitTime[0]), Integer.parseInt(splitTime[1]));
        flyingSchedule.add(new Flight(planeID, flightStatus, city, time));
    }

    public String examineStatusMajority() {
        int departure = 0;
        int arrival = 0;
        for (Flight element: flyingSchedule) {
            if (element.getFlightStatus() == Status.Arrival) {
                arrival++;
            } else if (element.getFlightStatus() == Status.Departure) {
                departure++;
            }
        }
        return (departure > arrival ? "Departure: " + departure : "Arrival: " + arrival );
    }

    public String getFlightByFlightId(String flightID) {
        for (Flight element: flyingSchedule) {
            if (flightID.equals(element.getPlaneId())) {
                return element.toString();
            }
        }
        throw new IllegalArgumentException("<Can not find any flight with this flightID! " + flightID + ">");
    }

    public List<Flight> selectFlightByCityAndStatus(String city, String status) {
        List<Flight> selectedFlights = new ArrayList<>();
        for (Flight element: flyingSchedule) {
            if (city.equals(element.getCity()) && Status.valueOf(status).equals(element.getFlightStatus())) {
                selectedFlights.add(element);
            }
        }
        return selectedFlights;
    }

    public Flight lookUpTheEarliestDepartureFlight() {
        Flight earliestDepartureFlight = firstDepartureFlight();    //Kezdőértéknek az első érkező járatot adom meg, a problémák elkerülése végett.
        for (Flight element: flyingSchedule) {
            if (element.getTime().isBefore(earliestDepartureFlight.getTime()) && Status.Departure.equals(element.getFlightStatus())) {
                earliestDepartureFlight = element;
            }
        }
        return earliestDepartureFlight;
    }

    private Flight firstDepartureFlight() {
        for (Flight element: flyingSchedule) {
            if(Status.Departure.equals(element.getFlightStatus())) {
                return element;
            }
        }
        throw new IllegalArgumentException("<Can not find Departure flight!>");
    }

    public List<Flight> getFlyingSchedule() {
        return flyingSchedule;
    }


    public static void main(String[] args) {
        Airport access = new Airport();
        String fileLocation = "/cities.txt";
        String testFlightID = "VL4639";

        access.readFile(fileLocation);

        System.out.println(access.getFlyingSchedule().toString());      //1.
        System.out.println(access.examineStatusMajority());             //2.
        System.out.println(access.getFlightByFlightId(testFlightID));    //3.
        System.out.println(access.selectFlightByCityAndStatus("Dublin", "Arrival"));    //4.
        System.out.println(access.lookUpTheEarliestDepartureFlight());  //5.
    }

}