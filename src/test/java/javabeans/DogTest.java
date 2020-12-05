package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DogTest {

    @Test
    public void testSetAndGetName() {
        String dogName = "Macukó";
        Dog dog = new Dog();
        dog.setName(dogName);

        assertEquals(dogName, dog.getName());
    }

    @Test
    public void testSetAndGetAge() {
        int dogAge = 10;
        Dog dog = new Dog();
        dog.setAge(dogAge);

        assertEquals(dogAge, dog.getAge());
    }

    @Test
    public void testSetAndIsPedigree() {
        boolean dogPedigree = true;
        Dog dog = new Dog();
        dog.setPedigree(dogPedigree);

        assertTrue(dog.isPedigree());
    }

    @Test
    public void testSetAndGetWeight() {
        double dogWeight = 15.5;
        Dog dog = new Dog();
        dog.setWeight(dogWeight);

        assertEquals(dogWeight, dog.getWeight());
    }

}
