package week05d04;

import java.time.LocalDate;

public class Product {

    private String productName;
    private LocalDate productExpirationDate;

    public Product(String productName, int year, int month, int day) {
        this.productName = productName;
        this.productExpirationDate = LocalDate.of(year,month,day);
    }

    public String getProductName() {
        return productName;
    }

    public LocalDate getProductExpirationDate() {
        return productExpirationDate;
    }

    public boolean expirationValidator() {
        if (productExpirationDate.isBefore(LocalDate.now())) {
            return false;
        }
        return true;
    }

}
