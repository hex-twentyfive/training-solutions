package virtualmethod.vehicle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void getGrossLoadWithRealValues() {
        int vehicleTestWeight = 1500;
        int testNumberOfPassengers = 4;
        int expectedGrossLoad = (testNumberOfPassengers + 1) * Car.PERSON_AVERAGE_WEIGHT + vehicleTestWeight;

        Car car = new Car(vehicleTestWeight, testNumberOfPassengers);

        assertEquals(expectedGrossLoad, car.getGrossLoad());
    }

    @Test
    public void tostring() {
        int vehicleTestWeight = 1500;
        int testNumberOfPassengers = 4;
        Car car = new Car(vehicleTestWeight, testNumberOfPassengers);

        assertEquals("Car{numberOfPassenger=" + 4 + ", vehicleWeight=" + 1500 + '}', car.toString());
    }

}