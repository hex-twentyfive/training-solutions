package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store productFirst = new Store("Anyahajókabinajtó");

        productFirst.store(10);
        System.out.println("The stock is currently: " + productFirst.getProduct() + " --> " + productFirst.getStock() + " db");

        productFirst.dispatch(5);
        System.out.println("The stock is currently: " + productFirst.getProduct() + " --> " + productFirst.getStock() + " db");

        Store productSecond = new Store("Anyahajóhajókürt");

        productSecond.store(13);
        System.out.println("The stock is currently: " + productSecond.getProduct() + " --> " + productSecond.getStock() + " db");

        productSecond.dispatch(6);
        System.out.println("The stock is currently: " + productSecond.getProduct() + " --> " + productSecond.getStock() + " db");

    }
}
