package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please specify a product!");
        String productName = scanner.nextLine();

        System.out.println("Please specify the price of a product!");
        int productPrice = scanner.nextInt();

        Product productTransfer = new Product(productName, productPrice);
        System.out.println("product: " + productTransfer.getName() + " - price: " + productTransfer.getPrice());

        productTransfer.incrisePrice(10);
        System.out.println("If the price of the product increased by 10 units: " + productTransfer.getPrice());

        productTransfer.decrisePrice(5);
        System.out.println("Then, if the price of the product decrised by 5 units: " + productTransfer.getPrice());

    }
}
