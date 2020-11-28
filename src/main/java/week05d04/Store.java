package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public boolean addProduct(Product product) {
        if ( addProductNameValidator(product) && addProductExpirationValidator(product)) {
        productList.add(product);
        return true;
        }
        return false;
    }

    public int getNumberOfExpired() {
        int dateExpiredProduct = 0;
        for (Product element: productList) {
            if ( element.getProductExpirationDate().isBefore(LocalDate.now()) ) {
                dateExpiredProduct++;
            }
        }
        return dateExpiredProduct;
    }

    public boolean addProductNameValidator(Product product) {
        for (Product element: productList ) {
            if ( element.getProductName().equals(product.getProductName())) {
                return false;
            }
        }
        return true;
    }

    public boolean addProductExpirationValidator(Product product) {
         return product.expirationValidator();
    }


    public static void main(String[] args) {

        Product product1 = new Product("Tej", 2020,11,30);
        Product product2 = new Product("Konzerv",2020,10,10);
        Product product3 = new Product("Margarin",2020,12,15);
        Product product4 = new Product("Majonéz",2020,06,20);
        Product product5 = new Product("Tőkehús",2020,12,05);

        Store store = new Store();

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);


        System.out.println(store.getNumberOfExpired());
        System.out.println(store.addProductNameValidator(product5) + " " + store.addProductExpirationValidator(product5));
        System.out.println("Teszt hozzáadás --> " + store.addProduct(product5));
        System.out.println("");
        for (Product element: store.getProductList()) {
            System.out.println(element.getProductName() + " " + element.getProductExpirationDate());
        }

    }
}
