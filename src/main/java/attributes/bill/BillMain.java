package attributes.bill;

public class BillMain {

    public static void main(String[] args) {

        Bill instBill = new Bill();

        Item product1 = new Item("Product1",10,1911);
        Item product2 = new Item("Product2",20,1025);
        Item product3 = new Item("Product3",30,1981);

        instBill.addItem(product1);
        instBill.addItem(product2);
        instBill.addItem(product3);

        System.out.println(instBill.calculateTotalPrice());
    }
}
