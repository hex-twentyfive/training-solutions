package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    public void testCreateTruckWithNoParameter() {
        Truck testTruck = new Truck();

        assertEquals(5, testTruck.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, testTruck.getTaransmissionType());
    }

    @Test
    public void testCreateTruckWithTwoParameters() {
        Truck testTruck = new Truck(6, TransmissionType.AUTOMATIC);

        assertEquals(6, testTruck.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, testTruck.getTaransmissionType());
    }

}