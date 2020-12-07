package week06d04;

import java.util.ArrayList;
import java.util.List;

/*        Készíts a week06d04.Budget osztályt, amely a konstruktorában Item példányokat vár listában (List).
        At Item tartalmazza az alábbi attribútumokat:
        int price, int month, String name.
        A Budget osztály tárolja el egy attribútumban a konstruktorban megkapott items listát.
        Írjunk egy metódust, getItemByMonth néven, mely egy hónapot vár (1-12) és visszaadja az Itemeket az adott hónapban!
        Írjunk Tesztet!
        Bónusz feladat: ellenőrizzük a bemeneti paramétereket.
*/

public class Budget {

    List<Item> itemList = new ArrayList<>();

    public Budget(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemByMonth(int filterMonth) {

        if (filterMonth < 1 || filterMonth > 12) {
            throw new IllegalArgumentException("Invalid month supplied!");
        }

        List<Item> filteredItems = new ArrayList<>();
        for (Item element: itemList) {
            if (element.getMonth() == filterMonth) {
                filteredItems.add(element);
            }
        }
        return filteredItems;
    }

}
