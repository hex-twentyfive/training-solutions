package constructoroverloading.bus;

import java.math.BigDecimal;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int difference(SimpleTime time) {
        return Math.abs(timeInMinutes(this.hours, this.minutes) - timeInMinutes(time.getHours(), time.minutes));
    }

    public String differenceToStringForFun(int diferentTime) {
        int hours = diferentTime / 60;
        double minutesInDouble = Math.round(((diferentTime / 60.0) - hours) * 60);
        int minutes = (int) minutesInDouble;
        if (minutes == 0) {
            return hours + " : 00";
        }
        return hours + " : " + minutes;
    }

    public int timeInMinutes(int hours, int minutes) {
        return ( 60 * hours ) + minutes;
    }

    public String toString() {
        if (minutes == 0) {
            return hours + " : 00";
        }
        return hours + " : " + minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
