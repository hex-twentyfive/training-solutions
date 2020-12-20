package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testCreateVehicleWithNoParameter() {
        Vehicle testVehicle = new Vehicle();

        assertEquals(5, testVehicle.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, testVehicle.getTaransmissionType());
    }

    @Test
    public void testCreateVehicleWithTwoParameters() {
        Vehicle testVehicle = new Vehicle(8, TransmissionType.AUTOMATIC);

        assertEquals(8, testVehicle.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, testVehicle.getTaransmissionType());
    }

}