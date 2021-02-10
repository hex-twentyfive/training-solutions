package week14d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OnlineShopping {

/*  Adott egy fájl melyben online bevásárlások találhatók. A fájl a még ki nem szállított rendeléseket tartalmazza.
    Egy sorban egy egyedi azonosító és utána a termékek neve van felsorololva.
    Minden vásárlás legalább 2 termékből áll.

    0. Olvasd be a fájlt és tárold el az adatokat a memóriában, majd oldd meg a következő feladatokat.
    1. Egyedi azonosító alapján legyenek lekérdezhetőek a vásárolt termékek ABC sorrendben.
    2. Számoljuk össze, egy termék neve alapján, hogy abból a termékből mennyit adtak el.
    3. Adjuk vissza egy vásárlási azonosító alapján, hogy hány termék szerepel a vásárlásban.
    4. Készíts statisztikát melyben visszaadod, hogy az egyes termékek hányszor szerepelnek a fájlban.
*/

    private Map<String, List<String>> idAndProducts = new HashMap<>();

    public void readThePurchaseList(String fileLocation) {      // 0.
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileLocation)))) {
            String line;
            while ((line=bufferedReader.readLine()) != null) {
                String id = createIdFromTheLine(line);
                List<String> products = createListFromTheLines(line);
                createMapFromIdAndListOfProducts(id, products);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("<!> Can not read the file! <!>", ioe);
        }
    }

    private String createIdFromTheLine(String line) {
        String[] idAndProductsFromTheLine = line.split(" ");
        return idAndProductsFromTheLine[0];
    }

    private List<String> createListFromTheLines(String line) {
        String[] idAndProductsFromTheLine = line.split(" ");
        String[] products = idAndProductsFromTheLine[1].split(",");
        return new ArrayList<>(Arrays.asList(products));
    }

    private void createMapFromIdAndListOfProducts(String id, List<String> products) {
        idAndProducts.put(id, products);
    }

    public List<String> queriesTheProductsBasedOnId(String id) {        // 1.
        List<String> idAndProductInList = idAndProducts.get(id);
        Collections.sort(idAndProductInList);
        return idAndProductInList;
    }

    public int countsTheSaleBasedOnProductName(String product) {        // 2.
        int productSalesCounter = 0;
        for (Map.Entry<String, List<String>> entries: idAndProducts.entrySet()) {
            for (String item: entries.getValue()) {
                if (product.equals(item)) {
                    productSalesCounter++;
                }
            }
        }
        return productSalesCounter;
    }

    public int countTheNumberOfProductInATransactionBasedOnId(String id) {  // 3.
        return idAndProducts.get(id).size();
    }

    public Map<String, Integer> makeStatisticFromProductOccurrences() {     // 4.
        Map<String, Integer> productSalesCounter = new TreeMap<>();
        for (Map.Entry<String, List<String>> entries: idAndProducts.entrySet()) {
            for (String item: entries.getValue()) {
                if (!productSalesCounter.containsKey(item)) {
                    productSalesCounter.put(item, 1);
                } else {
                    productSalesCounter.put(item, productSalesCounter.get(item) + 1);
                }
            }
        }
        return productSalesCounter;
    }

    public Map<String, List<String>> getIdAndProducts() {
        return idAndProducts;
    }

    public static void main(String[] args) {
        OnlineShopping access = new OnlineShopping();
        String fileLocation = "/listOfOnlinePurchases.txt";

        access.readThePurchaseList(fileLocation);
        System.out.println("0. " + access.idAndProducts);
        System.out.println("1. " + access.queriesTheProductsBasedOnId("W34111"));
        System.out.println("2. " + access.countsTheSaleBasedOnProductName("sugar"));
        System.out.println("3. " + access.countTheNumberOfProductInATransactionBasedOnId("W34111"));
        System.out.println("4. " + access.makeStatisticFromProductOccurrences());
    }

}