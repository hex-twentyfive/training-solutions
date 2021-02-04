package week13d02;

import java.time.LocalTime;

public class Flight {

    private String planeId;
    private Status flightStatus;
    private String city;
    private LocalTime time;

    public Flight(String planeId, Status flightStatus, String city, LocalTime time) {
        this.planeId = planeId;
        this.flightStatus = flightStatus;
        this.city = city;
        this.time = time;
    }

    public String getPlaneId() {
        return planeId;
    }

    public Status getFlightStatus() {
        return flightStatus;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Flight{ " +
                "planeId = " + planeId +
                ", flightStatus = " + flightStatus +
                ", city = " + city +
                ", time = " + time +
                " }";
    }

}
