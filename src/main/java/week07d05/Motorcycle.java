package week07d05;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        super(5, TransmissionType.SEQUENTIAL);
    }

    public Motorcycle(int numberOfGears, TransmissionType taransmissionType) {
        super(numberOfGears, taransmissionType);
    }
}
