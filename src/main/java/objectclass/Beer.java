package objectclass;

import java.util.Objects;

public class Beer {

    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return Objects.equals(name, beer.name) &&
                Objects.equals(price, beer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
