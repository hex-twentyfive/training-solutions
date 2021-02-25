package week11d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    Courier access = new Courier();

    @Test
    public void createRidesWithCorrectValues() {
        access.addRide(1,1,5);
        access.addRide(2,1,10);
        access.addRide(3,1,15);

        assertEquals(3, access.getRides().size());
    }

    @Test
    public void createRidesWithWrongValues() {
        access.addRide(3, 3, 15);

        assertThrows(IllegalArgumentException.class, () -> access.addRide(2, 1, 10));
        assertThrows(IllegalArgumentException.class, () -> access.addRide(3, 1, 10));
    }

    @Test
    public void createRidesWithNullValues() {
        assertThrows(IllegalArgumentException.class, () -> access.addRide(0, 1, 10));
        assertThrows(IllegalArgumentException.class, () -> access.addRide(1, 0, 10));
    }

    @Test
    public void testdayWithoutWork() {
        access.addRide(1,1,5);
        access.addRide(2,1,10);
        access.addRide(4,1,20);

        assertEquals(3, access.dayWithoutWork());
    }

}