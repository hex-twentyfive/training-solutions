package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ListSelectorTest {

    ListSelector lS = new ListSelector();

    @Test
    public void everySecondElementOfListCaseOfNormal() {

        List<String> testList = new ArrayList<>(Arrays.asList("alma", "kabát", "Géza", "kilóméter", "csütörtök"));

        assertEquals("[almaGézacsütörtök]",lS.everySecondElementOfList(testList));

    }

    @Test
    public void everySecondElementOfListCaseOfNull() {

        assertThrows(IllegalArgumentException.class, ()->lS.everySecondElementOfList(null));
    }

    @Test
    public void everySecondElementOfListCaseOfEmptyList() {

        List<String> testList = new ArrayList<>(Arrays.asList());

        assertEquals("",lS.everySecondElementOfList(testList));
    }


}
