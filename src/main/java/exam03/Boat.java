package exam03;

public class Boat {

    private String name;
    private int maxPassengers;

    public Boat(String name, int maxPassenger) {
        this.name = name;
        this.maxPassengers = maxPassenger;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

}