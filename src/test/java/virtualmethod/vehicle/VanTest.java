package virtualmethod.vehicle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VanTest {

    int vanTestWeight = 1750;
    int testNumberOfPassengers = 1;
    int testCargoWeight = 500;

    @Test
    public void getGrossLoad(){
        int expectedGrossLoad = (testNumberOfPassengers + 1) * Van.PERSON_AVERAGE_WEIGHT + vanTestWeight + testCargoWeight;

        Van van = new Van(vanTestWeight, testNumberOfPassengers, testCargoWeight);

        assertEquals(expectedGrossLoad, van.getGrossLoad());
    }

    @Test
    public void tostring() {

        Van van = new Van(vanTestWeight, testNumberOfPassengers, testCargoWeight);

        assertEquals("Van{cargoWeight=" + testCargoWeight + ", numberOfPassenger=" + testNumberOfPassengers + ", vehicleWeight=" + vanTestWeight + '}', van.toString());
    }

}