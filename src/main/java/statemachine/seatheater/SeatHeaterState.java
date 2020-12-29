package statemachine.seatheater;

public enum SeatHeaterState {

    SEAT_HEATER_STATE_OFF {
        SeatHeaterState next() {
            return SeatHeaterState.SEAT_HEATER_STATE_THREE;
        }
    },
    SEAT_HEATER_STATE_THREE {
        SeatHeaterState next() {
            return SeatHeaterState.SEAT_HEATER_STATE_TWO;
        }
    },
    SEAT_HEATER_STATE_TWO {
        SeatHeaterState next() {
            return SeatHeaterState.SEAT_HEATER_STATE_ONE;
        }
    },
    SEAT_HEATER_STATE_ONE {
        SeatHeaterState next() {
            return SeatHeaterState.SEAT_HEATER_STATE_OFF;
        }
    };

    abstract SeatHeaterState next();

}
