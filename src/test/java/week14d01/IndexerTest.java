package week14d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    public void testIndex() {
        Indexer access = new Indexer();
        List<String> testList = new ArrayList<>(List.of("Odon","Orsolya","Lujza", "Abraham", "Magdolna","Olga"));

        Map<Character,List<String>> expectedMap = new HashMap<>();
        expectedMap.put('A', new ArrayList<>(List.of("Abraham")));
        expectedMap.put('L', new ArrayList<>(List.of("Lujza")));
        expectedMap.put('M', new ArrayList<>(List.of("Magdolna")));
        expectedMap.put('O', new ArrayList<>(List.of("Odon", "Orsolya", "Olga")));

        assertEquals(expectedMap, access.index(testList));
    }

    @Test
    public void testIndexWithEmptyList() {
        Indexer access = new Indexer();
        List<String> emptyTestList = new ArrayList<>();

        assertThrows(IllegalArgumentException.class, ()->access.index(emptyTestList));
    }

}