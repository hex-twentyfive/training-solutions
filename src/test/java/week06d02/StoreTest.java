package week06d02;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void testGetProductByCategoryName() {

        List<Product> testProductList = new ArrayList<>();
        testProductList.add(new Product("merchandise1",Category.DAIRY,500));
        testProductList.add(new Product("merchandise2",Category.FROZEN,1_000));
        testProductList.add(new Product("merchandise3",Category.OTHER,10_000));
        testProductList.add(new Product("merchandise4",Category.OTHER,10_000));
        testProductList.add(new Product("merchandise5",Category.FROZEN,10_000));

        Store s = new Store(testProductList);

        assertEquals(2, s.getProductByCategoryName(Category.FROZEN));
        assertEquals(1, s.getProductByCategoryName(Category.DAIRY));
        assertEquals(0, s.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(2, s.getProductByCategoryName(Category.OTHER));
    }

}
