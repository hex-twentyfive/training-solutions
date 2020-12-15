package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);

        if (extraCapacity < extraFuel) {
            throw new IllegalArgumentException("The amount of extra fuel must not exceed the capacity of the extra fuel tank!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        this.extraFuel += fuel;
    }

    private boolean isEnoughFuelJeep(int distance) {
        double totalFuelLevel = ( super.getFuel() + extraFuel );
        return totalFuelLevel >= ( distance / 100.0 ) * super.getFuelRate();
    }

    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new RuntimeException("There is not enough fuel for this trip!");
        }
        double requiredFuel = ( ( km / 100.0 ) * super.getFuelRate() );
        extraFuel = extraFuel - requiredFuel;
        if (extraFuel < 0) {
            super.modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    public double calculateRefillAmount() {
        double totoalCapacity = ( super.getTankCapacity() + extraCapacity );
        double totalFuelLevel = ( super.getFuel() + extraFuel );
        return totoalCapacity - totalFuelLevel;
    }
}
