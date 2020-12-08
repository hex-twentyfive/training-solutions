package methodoverloading;

import java.time.LocalTime;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isEqual(Time time) {
        LocalTime defaultTime = LocalTime.of(this.hours, this.minutes, this.seconds);
        LocalTime inputTime = LocalTime.of(time.getHours(), time.getMinutes(), time.getSeconds());

        return defaultTime.equals(inputTime);
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        LocalTime defaultTime = LocalTime.of(this.hours, this.minutes, this.seconds);
        LocalTime inputTime = LocalTime.of(hours, minutes, seconds);

        return defaultTime.equals(inputTime);
    }

    public boolean isEarlier(Time time) {
        LocalTime defaultTime = LocalTime.of(this.hours, this.minutes, this.seconds);
        LocalTime inputTime = LocalTime.of(time.getHours(), time.getMinutes(), time.getSeconds());

        if (defaultTime.isBefore(inputTime)) {
        return true;
        }
        return false;
    }


    public boolean isEarlier(int hours, int minutes, int seconds) {
        LocalTime defaultTime = LocalTime.of(this.hours, this.minutes, this.seconds);
        LocalTime inputTime = LocalTime.of(hours, minutes, seconds);

        if (defaultTime.isBefore(inputTime)) {
            return true;
        }
        return false;
    }


}
