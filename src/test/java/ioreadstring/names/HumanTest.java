package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void testCreateHuman() {
        Human human = new Human("John", "Doe");
        String expectedFirstName = "John";
        String expectedLastName = "Doe";

        assertEquals(expectedFirstName, human.getFirstName());
        assertEquals(expectedLastName, human.getLastName());
    }

}