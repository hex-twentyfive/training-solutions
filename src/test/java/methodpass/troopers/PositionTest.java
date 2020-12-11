package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    public void testDistanceFrom() {

        double posX1 = 5;
        double posY1 = 5;
        double posX2 = 10;
        double posY2 = 10;

        Position trooper1 = new Position(posX1, posY1);
        Position trooper2 = new Position(posX2, posY2);

        System.out.println(trooper1.distanceFrom(trooper2));
        System.out.println(trooper2.distanceFrom(trooper1));
        assertEquals(7.0710678118654755, trooper1.distanceFrom(trooper2));
    }

}