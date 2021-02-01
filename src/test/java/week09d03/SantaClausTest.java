package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {


    @Test
    public void testCreateNewPerson() {
        String testName = "Kovács Józsika";
        int testAge = 8;

        Person person = new Person(testName, testAge);

        assertEquals(testName, person.getName());
        assertEquals(testAge, person.getAge());
    }

    @Test
    public void testGetThroughChimneys() {
        Person person1 = new Person("Kovács Józsika", 8);
        Person person2 = new Person("Lakatos Frodó", 48);
        Person person3 = new Person("Smaug The Dragon", 1_778);

        List<Person> testPersonList = new ArrayList<>(List.of(person1,person2,person3));

        SantaClaus santa = new SantaClaus(testPersonList);

        assertNull(santa.getPersons().get(1).getGift());

        santa.getThroughChimneys();

        assertNotNull(santa.getPersons().get(1).getGift());

        System.out.println(santa.getPersons().get(1).getGift());
    }

}