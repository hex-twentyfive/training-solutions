package virtualmethod.vehicle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void getGrossLoad() {
        int vehicleTestWeight = 1500;
        int expectedGrossWeight = vehicleTestWeight + Vehicle.PERSON_AVERAGE_WEIGHT;

        Vehicle vehicle = new Vehicle(vehicleTestWeight);

        assertEquals(expectedGrossWeight, vehicle.getGrossLoad());
    }

    @Test
    public void getVehicleWeight() {
        int vehicleTestWeight = 1500;
        int expectedWeight = 1500;

        Vehicle vehicle = new Vehicle(vehicleTestWeight);

        assertEquals(expectedWeight, vehicle.getVehicleWeight());
    }

    @Test
    public void tostring() {
        int vehicleTestWeight = 1500;

        Vehicle vehicle = new Vehicle(vehicleTestWeight);

        assertEquals("Vehicle{vehicleWeight=" + 1500 + '}', vehicle.toString());
    }

}