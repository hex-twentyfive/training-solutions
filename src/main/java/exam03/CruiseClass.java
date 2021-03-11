package exam03;

public enum CruiseClass {

    LUXURY(3.0),
    FIRST(1.8),
    SECOND(1.0);

    private final double priceRate;

    CruiseClass(double priceRate) {
        this.priceRate = priceRate;
    }

    public double getPriceRate() {
        return priceRate;
    }

}