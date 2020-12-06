package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        if (price <= 0 || month <= 0 || month > 12 || name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("The parameters must be entered correctly!");
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
}
