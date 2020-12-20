package week07d05;

public class Vehicle {

/*   Készíts a week07d05 csomagba egy Vehicle, egy Car, egy Truck és egy Motorcycle osztályt.
     A Vehicle osztálynak legyen egy int getNumberOfGears és egy TransmissionType getTransmissionType metódusa.
     A fenti osztályok értelemszerűen öröklődjenek egymásból és mindegyiknek implementálja a sebességek számát
     és a váltó típusát. A lehetséges váltótípusok: MANUAL, AUTOMATIC, SEQUENTIAL. Az alapértelmezett váltó típus
     (a Vehicle osztályban) MANUAL, de a Car automatikus, míg a Motorcycle SEQUENTIAL.
     Az alapértelmezett sebesség szám 5.
     */

    private int numberOfGears;
    private TransmissionType taransmissionType;

    public Vehicle() {              // Az alapértelmezett váltó típus (a Vehicle osztályban) MANUAL. Az alapértelmezett sebesség szám 5.
        this.numberOfGears = 5;
        this.taransmissionType = TransmissionType.MANUAL;
    }

    public Vehicle(int numberOfGears, TransmissionType taransmissionType) {
        this.numberOfGears = numberOfGears;
        this.taransmissionType = taransmissionType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTaransmissionType() {
        return taransmissionType;
    }
}
