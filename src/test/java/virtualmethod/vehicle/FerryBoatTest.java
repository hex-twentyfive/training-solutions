package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FerryBoatTest {

    private int ferryBoatTestWeight = 2500;
    private int carTestWeight = 1500;
    private int vanTestWeight = 1750;
    private int testVanCargoWeight = 500;
    private int testNumberOfPassenger = 0;

    private int overSizedCarWeight = 2450;
    private int overSizedVanWeight = 2000;

    @Test
    public void canCarryTrue() {

        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(carTestWeight, testNumberOfPassenger);

        assertTrue(ferryBoat.canCarry(car));

        car = new Van(vanTestWeight, testNumberOfPassenger, testVanCargoWeight);

        assertTrue(ferryBoat.canCarry(car));
    }

    @Test
    public void canCarryFalse() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(overSizedCarWeight, testNumberOfPassenger);

        assertFalse(ferryBoat.canCarry(car));

        car = new Van(overSizedVanWeight, testNumberOfPassenger, testVanCargoWeight);

        assertFalse(ferryBoat.canCarry(car));
    }

    @Test
    public void loadSuccess() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(carTestWeight, testNumberOfPassenger);

        assertTrue(ferryBoat.load(car));
    }

    @Test
    public void loadFailed() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(overSizedCarWeight, testNumberOfPassenger);

        assertFalse(ferryBoat.load(car));
    }

    @Test
    public void getGrossLoad() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(carTestWeight, testNumberOfPassenger);

        int expectedGrossLoad = ferryBoatTestWeight + FerryBoat.PERSON_AVERAGE_WEIGHT + car.getGrossLoad();

        ferryBoat.load(car);

        assertEquals(expectedGrossLoad, ferryBoat.getGrossLoad());
    }

    @Test
    public void toStringCar() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Car car = new Car(carTestWeight, testNumberOfPassenger);

        ferryBoat.load(car);

        assertEquals("FerryBoat{" +
                "car=" +
                "Car{numberOfPassenger=" + testNumberOfPassenger + ", vehicleWeight=" + carTestWeight + '}' +
                '}', ferryBoat.toString());
    }

    @Test
    public void toStringVan() {
        FerryBoat ferryBoat = new FerryBoat(ferryBoatTestWeight);
        Van van = new Van(vanTestWeight, 1, testVanCargoWeight);

        ferryBoat.load(van);

        assertEquals("FerryBoat{car=Van{cargoWeight=" + testVanCargoWeight + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + vanTestWeight + "}}", ferryBoat.toString());
    }

}