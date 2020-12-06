package week06d04;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BudgetTest {

    private List<Item> itemList;
    private Budget budget;

    @BeforeEach
    public void setUp() {
        itemList = new ArrayList<>();
        budget = new Budget(itemList);

        Item item1 = new Item(25000, 1, "bill1");
        Item item2 = new Item(50000, 2, "bill2");
        Item item3 = new Item(125000, 3, "bill3");
        Item item4 = new Item(150000, 5, "bill4");
        Item item5 = new Item(100000, 10, "bill5");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
    }

    @Test
    public void testBudget1() {
        Assertions.assertEquals(1, budget.getItemsByMonth(2).size());
    }

    @Test
    public void testBudget2() {
        Assertions.assertEquals("bill3", budget.getItemsByMonth(3).get(0).getName());
    }

    @Test
    public void testBudget3() {
        Assertions.assertEquals(50000, budget.getItemsByMonth(2).get(0).getPrice());
    }
}
