package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    public void testGetNumberOfAnimalsWinthNonEmptyList() {
        List<Animal> testAnimals = new ArrayList<>();
        testAnimals.add(new Duck());
        testAnimals.add(new Lion());
        testAnimals.add(new Worm());
        testAnimals.add(new Duck());

        Zoo zoo = new Zoo(testAnimals);

        assertEquals(4, zoo.getNumberOfAnimal());
    }

    @Test
    public void testGetNumberOfLegsWithNonEmptyList() {
        List<Animal> testAnimals = new ArrayList<>();
        testAnimals.add(new Duck());
        testAnimals.add(new Lion());
        testAnimals.add(new Worm());
        testAnimals.add(new Duck());

        Zoo zoo = new Zoo(testAnimals);

        assertEquals(8, zoo.getNumberOfLegs());
    }

    @Test
    public void testGetNumberOfAnimalsWithEmptyList() {
        List<Animal> testAnimals = new ArrayList<>();

        Zoo zoo = new Zoo(testAnimals);

        assertEquals(0, zoo.getNumberOfAnimal());
    }

}