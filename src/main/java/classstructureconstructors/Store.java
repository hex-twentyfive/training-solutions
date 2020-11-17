package classstructureconstructors;

public class Store {
    private String product;
    private int stock;

    public Store(String product) {
        this.product = product;
        this.stock = 0;
    }

    public void store(int inputAmount) {
        this.stock = stock + inputAmount;
    }

    public void dispatch(int inputAmount) {
        this.stock = stock - inputAmount;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }
}

