package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    public static final int MAX_CARRY_WEIGHT = 2500;
    private Car car;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
        this.car = null;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + car.getGrossLoad();
    }

    public boolean canCarry(Car car) {
        return car != null && MAX_CARRY_WEIGHT > car.getGrossLoad();
    }

    public boolean load(Car car) {
        if (canCarry(car)) {
            this.car = car;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "FerryBoat{" +
                "car=" + car +
                '}';
    }

}
