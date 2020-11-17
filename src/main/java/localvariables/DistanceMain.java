package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance transferDistance = new Distance();

        System.out.println("The measurement was completed successfully!");
        System.out.println("The measured distance: " + transferDistance.getDistance());
        System.out.println("Was the measurement accurate?: " + transferDistance.isAccuracy());

        int distanceWholePart = (int) transferDistance.getDistance();
        System.out.println("");
        System.out.println("The whole part of the measured distance: " + distanceWholePart);
    }
}
