package methodstructure;

import methodstructure.bmi.BmiCategory;
import methodstructure.bmi.BodyMass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BodyMassTest {

    @Test
    public void  testBodyMassIndex() {
        double sampleWeight = 65;
        double sampleHeight = 1.70;

        BodyMass bM = new BodyMass(sampleWeight, sampleHeight);

        double expectedBodyMassIndex = sampleWeight / (sampleHeight * sampleHeight);

        assertEquals(expectedBodyMassIndex, bM.bodyMassIndex());
    }

    @Test
    public void body() {
        BodyMass bMNormal = new BodyMass(65,1.70);
        BodyMass bMOver = new BodyMass(120,1.65);
        BodyMass bMUnder = new BodyMass(55,1.80);

        assertEquals(BmiCategory.NORMAL, bMNormal.body());
        assertEquals(BmiCategory.OVERWEIGHT, bMOver.body());
        assertEquals(BmiCategory.UNDERWEIGHT, bMUnder.body());
    }

    @Test
    public void isThinnerThan() {
        BodyMass bMNormal = new BodyMass(65,1.70);
        BodyMass bMOver = new BodyMass(120,1.65);
        BodyMass bMUnder = new BodyMass(55,1.80);

        assertTrue(bMNormal.isThinnerThan(bMOver));
        assertFalse(bMNormal.isThinnerThan(bMUnder));
        assertTrue(bMUnder.isThinnerThan(bMOver));
    }
}
