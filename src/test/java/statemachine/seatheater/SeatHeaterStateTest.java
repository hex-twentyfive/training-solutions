package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    public void testNext() {

        assertEquals(SeatHeaterState.SEAT_HEATER_STATE_THREE, SeatHeaterState.SEAT_HEATER_STATE_OFF.next());
        assertEquals(SeatHeaterState.SEAT_HEATER_STATE_TWO, SeatHeaterState.SEAT_HEATER_STATE_THREE.next());
        assertEquals(SeatHeaterState.SEAT_HEATER_STATE_ONE, SeatHeaterState.SEAT_HEATER_STATE_TWO.next());
        assertEquals(SeatHeaterState.SEAT_HEATER_STATE_OFF, SeatHeaterState.SEAT_HEATER_STATE_ONE.next());
    }

}