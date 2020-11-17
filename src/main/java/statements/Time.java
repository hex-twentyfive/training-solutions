package statements;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes() {     // az időpont értékét percekben adja vissza, de a másodperceket figyelmen kívül hagyja.
        return (hours * 60) + minutes;
    }

    public int getInSeconds() {     //a teljes időpontot másodpercben adja vissza.
        return (hours * 3600) + (minutes * 60) + seconds;
    }



    public boolean earlierThan(Time secondTime) {   //Amennyiben az adott objektum által reprezentált időpont korábbi, mint a paraméterül kapott, igazat ad vissza, különben hamisat.
        int originalTime = this.getInSeconds();
        int compareTime = secondTime.getInSeconds();

        return originalTime < compareTime;

        // return originalTime +" & " + compareTime;
    }

    public String toString() {     //az időpontot óra:perc:másodperc formában szövegként adja vissza.
        return hours + ":" + minutes + ":" + seconds;
    }
}
