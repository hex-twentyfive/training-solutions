package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    @Test
    public void testSetAndGetName() {
        String humanName = "Lakatos Frodó";
        Human human = new Human();
        human.setName(humanName);

        assertEquals(humanName, human.getName());
    }

    @Test
    public void testSetAndGetWeight() {
        double humanWeight = 65;
        Human human = new Human();
        human.setWeight(humanWeight);

        assertEquals(humanWeight, human.getWeight());
    }

    @Test
    public void testSetAndGetIq() {
        int humanIQ = 125;
        Human human = new Human();
        human.setIq(humanIQ);

        assertEquals(humanIQ, human.getIq());
    }
}
