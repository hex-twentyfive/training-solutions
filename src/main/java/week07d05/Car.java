package week07d05;

public class Car extends Vehicle{

    public Car() {
        super(5,TransmissionType.AUTOMATIC);
    }

    public Car(int numberOfGears, TransmissionType taransmissionType) {
        super(numberOfGears, taransmissionType);
    }
}
