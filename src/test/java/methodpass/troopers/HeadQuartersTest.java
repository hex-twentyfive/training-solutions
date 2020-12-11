package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuartersTest {

        HeadQuarters hQ = new HeadQuarters();

    @BeforeEach
    public void setUp() {

        hQ.addTrooper(new Trooper("marinesDivision1"));
        hQ.addTrooper(new Trooper("infantryDivision1"));
        hQ.addTrooper(new Trooper("paratrooperCorps1"));
        hQ.addTrooper(new Trooper("specialForceUnit1"));
        hQ.addTrooper(new Trooper("supplyUnit7"));

        Position targetForUnit2 = new Position(5, 5);
        hQ.getTroopers().get(1).changePosition(targetForUnit2);             //infantryDivision1
        Position targetForUnit5 = new Position(12, 12);
        hQ.getTroopers().get(4).changePosition(targetForUnit5);             //supplyUnit7

    }

    @Test
    public void testAddTrooperAndGetTrooper() {
        String expectedName = "specialForceUnit1";

        assertEquals(expectedName, hQ.getTroopers().get(3).getName());
    }

    @Test
    public void testFindTrooperByName() {
        String testTrooperName = "infantryDivision1";
        System.out.println(hQ.getTroopers().get(1).getName());

        assertEquals(hQ.getTroopers().get(1), hQ.findTrooperByName(testTrooperName));
    }

    @Test
    public void testFindClosestTrooper() {
        Position positionForClosestUnitTest = new Position(10, 10);
        String expectedName = "supplyUnit7";

        assertEquals(expectedName, hQ.findClosestTrooper(positionForClosestUnitTest).getName());
    }

    @Test
    public void testMoveTrooperByName() {
        String testTrooperName = "marinesDivision1";
        Position positionForTestMove = new Position(15, 15);

        assertEquals(0, hQ.findTrooperByName(testTrooperName).getPosition().getPosX());
        assertEquals(0, hQ.findTrooperByName(testTrooperName).getPosition().getPosY());

        hQ.moveTrooperByName(testTrooperName,positionForTestMove);

        assertEquals(15, hQ.findTrooperByName(testTrooperName).getPosition().getPosX());
        assertEquals(15, hQ.findTrooperByName(testTrooperName).getPosition().getPosY());
    }

    @Test
    public void testMoveClosestTrooper() {
        Position positionForClosestTrooperMove = new Position(15, 15);
        String expectedName = "supplyUnit7";

        assertEquals(expectedName, hQ.findClosestTrooper(positionForClosestTrooperMove).getName());
        assertEquals(12, hQ.findClosestTrooper(positionForClosestTrooperMove).getPosition().getPosX());
        assertEquals(12, hQ.findClosestTrooper(positionForClosestTrooperMove).getPosition().getPosX());

        hQ.moveClosestTrooper(positionForClosestTrooperMove);

        assertEquals(15, hQ.findTrooperByName(expectedName).getPosition().getPosX());
        assertEquals(15, hQ.findTrooperByName(expectedName).getPosition().getPosY());
    }

    @Test
    public void testMoveTrooper() {
        Position positionForTestingTrooperMove = new Position(15, 15);

        assertEquals(5, hQ.getTroopers().get(1).getPosition().getPosX());
        assertEquals(5, hQ.getTroopers().get(1).getPosition().getPosY());

        hQ.moveTrooper(hQ.getTroopers().get(1), positionForTestingTrooperMove);

        assertEquals(15, hQ.getTroopers().get(1).getPosition().getPosX());
        assertEquals(15, hQ.getTroopers().get(1).getPosition().getPosY());
    }

}