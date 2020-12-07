package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be blank!");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0!");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month supplied!");
        }

        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {              //Ez is Alt+insert-el generálható!
        return "Item{" +
                "price=" + price +
                ", month=" + month +
                ", name='" + name + '\'' +
                '}';
    }
}
