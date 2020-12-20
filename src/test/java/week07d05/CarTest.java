package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    public void testCreateCarWithNoParameter() {
        Car testCar = new Car();

        assertEquals(5, testCar.getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, testCar.getTaransmissionType());
    }

    @Test
    public void testCreateCarWithTwoParameters() {
        Car testCar = new Car(8, TransmissionType.SEQUENTIAL);

        assertEquals(8, testCar.getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, testCar.getTaransmissionType());
    }

}