package methodchain.robot;

public class NavigationPoint {

    private int currentDistance;
    private int currentAzimuth;

    public NavigationPoint(int currentDistance, int currentAzimuth) {
        this.currentDistance = currentDistance;
        this.currentAzimuth = currentAzimuth;
    }

    public int getCurrentDistance() {
        return currentDistance;
    }

    public int getCurrentAzimuth() {
        return currentAzimuth;
    }

    public String toString() {
        return "Curent distance --> " + currentDistance + "   Current azimut --> " + currentAzimuth + "\n";
    }
}
