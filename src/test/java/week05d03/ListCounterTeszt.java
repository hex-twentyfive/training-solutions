package week05d03;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTeszt {

    @Test
    public void startWithAteszt () {                // "A" val vagy "a" val kezdődik

        ListCounter listCounter = new ListCounter();

        List<String> testList = Arrays.asList("Alma", "eper", "ananász", "körte", "avokado", "ribizli", "András");

        assertEquals(4, listCounter.listElementFilter(testList));

    }

    @Test
    public void startsWithNonAListTest() {          // Nem tartalmaz keresett elemet

        ListCounter listCounter = new ListCounter();

        List<String> testList = Arrays.asList("eper", "körte", "ribizli", "sárgabarack", "dinnye");          

        assertEquals(0, listCounter.listElementFilter(testList));
    }

    @Test
    public void startsWithAEmptyListTest() {        // Üres Lista eset

        ListCounter listCounter = new ListCounter();

        List<String> testList = new ArrayList<>();

        assertEquals(0, listCounter.listElementFilter(testList));
    }



}
