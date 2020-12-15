package inheritanceconstructor.cars;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("The amount of fuel must not exceed the capacity of the tank!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    private boolean isEnoughFuel(int distance) {

        return fuel >= ( distance / 100.0 ) * fuelRate;
    }

    public void drive(int km) {
        if (!isEnoughFuel(km)) {
            throw new RuntimeException("There is not enough fuel for this trip!");
        }
        fuel = fuel - ( ( km / 100.0 ) * fuelRate );
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

}
