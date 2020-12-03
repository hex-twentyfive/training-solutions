package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category) {
        int filterCounter = 0;
        for (Product elements: productList) {
            if ( elements.getCategory() == category) {
                filterCounter++;
            }
        }
        return filterCounter;
   }
}
