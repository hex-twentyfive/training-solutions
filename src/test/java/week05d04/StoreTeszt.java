package week05d04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTeszt {

    @Test
    public void addProductTest(){
        Store store = new Store();

        // dátum lejárt
        assertFalse(store.addProduct(new Product("Tej", 2020,11,25)));

        // dátum még nem járt le
        assertTrue(store.addProduct(new Product("Tej", 2020,12,15)));

        // elem név ismétlődés
        assertFalse(store.addProduct(new Product("Tej", 2020,12,16)));

    }

    @Test
    public void getNumberOfExpired() {
        List<Product> testList = new ArrayList<>();
        testList.add(new Product("Zokni", 2020,11,15));

//        Store store = new Store(testList);

//        assertEquals(1,store.getNumberOfExpired());

    }

}
