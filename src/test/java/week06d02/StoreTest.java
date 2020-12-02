package week06d02;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void testList() {

        List<Product> test = Arrays.asList(new Product("merchandise1",Category.OTHER,10000),
                new Product("merchandise2",Category.DAIRY,500),
                new Product("merchandise3",Category.FROZEN,1000),
                new Product("merchandise4",Category.OTHER,10000),
                new Product("merchandise5",Category.OTHER,10000)
        );

        Store store = new Store(test);

        assertEquals(3, store.getProductByCategoryName(Category.OTHER));
    }

}
