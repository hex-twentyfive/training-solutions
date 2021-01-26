package week12d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStatTest {


    @Test
    public void testSmallestLoneNumber() {
        NumberStat access = new NumberStat();
        List<Integer> testListOfNumbers = new ArrayList<>(List.of(1,1,5,3,4,5,6,5,6,4,1,6,5,4));
        int expectedNumber = 3;

        assertEquals(expectedNumber, access.smallestLoneNumber(testListOfNumbers));
    }

    @Test
    public void testSmallestLoneNumberWithEmptyList() {
        NumberStat access = new NumberStat();
        List<Integer> testListOfNumbers = new ArrayList<>();

        assertThrows(NullPointerException.class, ()-> access.smallestLoneNumber(testListOfNumbers));
    }

    @Test
    public void testFileReader() {
        NumberStat access = new NumberStat();
        assertEquals(0, access.getFileNumberContent().size());

        access.fileReader();

        assertEquals(9, access.getFileNumberContent().size());
    }

    @Test
    public void testNumberStatWithReadFromFile() {
        NumberStat access = new NumberStat();

        access.fileReader();
        int expectedNumber = 3;

        assertEquals(expectedNumber, access.smallestLoneNumber(access.getFileNumberContent()));
    }

    @Test void testSmallestLoneNumberWithNoLoneNumber() {
        NumberStat access = new NumberStat();
        List<Integer> testListOfNumbers = new ArrayList<>(List.of(1,1,5,5,4,4));

        assertThrows(IllegalStateException.class, ()-> access.smallestLoneNumber(testListOfNumbers));
    }

}