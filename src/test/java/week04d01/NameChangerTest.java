package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {


    @Test
    public void testCreateNewNameWithNameChanger() {
        String testName = "John Doe";

        NameChanger nameChanger = new NameChanger(testName);

        System.out.println(nameChanger.getFullName());
        assertEquals(testName, nameChanger.getFullName());
    }

    @Test
    public void createNameWithIllegalParameters() {
        String emptyTestName = "";
        String nullValueTestName = null;

        assertThrows(IllegalArgumentException.class, ()-> new NameChanger(emptyTestName));
        assertThrows(NullPointerException.class, ()-> new NameChanger(nullValueTestName));
    }

    @Test
    public void testChangeFirstName() {
        String testName = "John Doe";
        String firstNameToChange = "Jack";

        NameChanger nameChanger = new NameChanger(testName);

        nameChanger.changeFirstName(firstNameToChange);

        String expectedName = "Jack Doe";

        assertEquals(expectedName, nameChanger.getFullName());
    }

}