package week06d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BudgetTest {

    @Test
    public void testGetItemByMonth() {

        List<Item> testList = new ArrayList<>();
        testList.add(new Item(12_500,2,"Bill1"));
        testList.add(new Item(15_000,3,"Bill2"));
        testList.add(new Item(17_500,3,"Bill3"));
        testList.add(new Item(20_000,3,"Bill4"));
        testList.add(new Item(25_000,4,"Bill5"));
        int testMonth1 = 2;
        int testMonth3 = 3;

        Budget budget = new Budget(testList);

        assertEquals(1,budget.getItemByMonth(testMonth1).size());

        assertEquals(3,budget.getItemByMonth(testMonth3).size());

        assertEquals("Bill2", budget.getItemByMonth(testMonth3).get(0).getName());

        System.out.println(budget.getItemByMonth(testMonth3));      //így a generált ToString() segítségével már értelmezhetően írja ki az Item-eket.

    }

    @Test
    public void testGetItemByMonthWithIncorrectAssignment() {

        List<Item> testList = new ArrayList<>();
        Budget budget = new Budget(testList);

        assertThrows(IllegalArgumentException.class, () -> budget.getItemByMonth(13));
        assertThrows(IllegalArgumentException.class, () -> budget.getItemByMonth(0));

    }

}
