package week13d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    Airport airport = new Airport();
    String fileLocation = "/cities.txt";

    @Test
    public void testReadFile() {
        assertEquals(0, airport.getFlyingSchedule().size());

        airport.readFile(fileLocation);

        assertEquals(100, airport.getFlyingSchedule().size());
    }

    @Test
    public void testExamineStatusMajority() {
        airport.readFile(fileLocation);

        String expectedResult = "Departure: 54";

        assertEquals(expectedResult, airport.examineStatusMajority());
    }

    @Test
    public void testGetFlightByFlightId() {
        String testFlightID = "VL4639";

        airport.readFile(fileLocation);

        String expectedResult = "Flight{ planeId = VL4639, flightStatus = Departure, city = Vaduz, time = 08:10 }";

        assertEquals(expectedResult, airport.getFlightByFlightId(testFlightID));
    }

    @Test
    public void testSelectFlightByCityAndStatus() {
        String testCity = "Dublin";
        String testStatus = "Arrival";

        airport.readFile(fileLocation);

        assertEquals(3, airport.selectFlightByCityAndStatus(testCity, testStatus).size());
    }

    @Test
    public void testLookUpTheEarliestDepartureFlight() {
        airport.readFile(fileLocation);

        String expectedFlight = "Flight{ planeId = FG3210, flightStatus = Departure, city = Zurich, time = 06:16 }";

        assertEquals(expectedFlight, airport.lookUpTheEarliestDepartureFlight().toString());
    }

}