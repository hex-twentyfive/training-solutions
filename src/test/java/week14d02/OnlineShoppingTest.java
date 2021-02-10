package week14d02;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OnlineShoppingTest {

    OnlineShopping access = new OnlineShopping();
    private String fileLocation = "/listOfOnlinePurchases.txt";

    @Test
    public void testReadThePurchaseList() {
        access.readThePurchaseList(fileLocation);
        List<String> exceptedList = new ArrayList<>(List.of("beer", "chips"));

        System.out.println(access.getIdAndProducts().get("CM231"));
        assertEquals(exceptedList, access.getIdAndProducts().get("CM231"));
    }

    @Test
    public void testQueriesTheProductsBasedOnId() {
        access.readThePurchaseList(fileLocation);
        List<String> exceptedList = new ArrayList<>(List.of("bread", "flour", "sugar", "tomato"));

        System.out.println(access.queriesTheProductsBasedOnId("A233"));
        assertEquals(exceptedList, access.queriesTheProductsBasedOnId("A233"));
    }

    @Test
    public void testCountsTheSaleBasedOnProductName() {
        access.readThePurchaseList(fileLocation);
        String productToLookUp = "beer";

        System.out.println(access.countsTheSaleBasedOnProductName(productToLookUp));
        assertEquals(2, access.countsTheSaleBasedOnProductName(productToLookUp));
    }

    @Test
    public void testCountTheNumberOfProductInATransactionBasedOnId() {
        access.readThePurchaseList(fileLocation);

        System.out.println(access.countTheNumberOfProductInATransactionBasedOnId("W34111"));
        assertEquals(8, access.countTheNumberOfProductInATransactionBasedOnId("W34111"));
    }

    @Test
    public void testMakeStatisticFromProductOccurrences() {
        access.readThePurchaseList(fileLocation);
        int expectedSaleNumber = 3;
        String testProduct = "sugar";

        System.out.println(access.makeStatisticFromProductOccurrences());
        assertEquals(expectedSaleNumber, access.makeStatisticFromProductOccurrences().get(testProduct));
    }

}