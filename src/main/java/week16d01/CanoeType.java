package week16d01;

public enum CanoeType {
    RED(1.0),
    GREEN(1.2),
    BLUE(1.5);

    private final double priceRate;
    private final double hourlyRentalFee = 5000;

    CanoeType(double priceRate) {
        this.priceRate = priceRate;
    }

    public double getPriceRate() {
        return priceRate * hourlyRentalFee;
    }
}