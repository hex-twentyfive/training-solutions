package week11d02;

public class Ride {

    private int dayOfFreight;       //Hanyadik napon volt a fuvar.
    private int dailyFreightNumber;     //Hanyadik fuvar a napon.
    private int freightDistance;            //Hány kilóméter volt az adott fuvar.


    public Ride(int dayOfFreight, int dailyFreightNumber, int freightDistance) {
        this.dayOfFreight = dayOfFreight;
        this.dailyFreightNumber = dailyFreightNumber;
        this.freightDistance = freightDistance;
    }

    public int getDayOfFreight() {
        return dayOfFreight;
    }

    public int getDailyFreightNumber() {
        return dailyFreightNumber;
    }

    public int getFreightDistance() {
        return freightDistance;
    }

}