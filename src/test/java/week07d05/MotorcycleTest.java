package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    public void testCreateMotorcycleWithNoParameter() {
        Motorcycle testMotrocycle = new Motorcycle();

        assertEquals(5, testMotrocycle.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, testMotrocycle.getTaransmissionType());
    }

    @Test
    public void testCreateMotorcycleWithTwoParameters() {
        Motorcycle testMotrocycle = new Motorcycle(4, TransmissionType.MANUAL);

        assertEquals(4, testMotrocycle.getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, testMotrocycle.getTaransmissionType());
    }

}