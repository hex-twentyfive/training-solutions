package introinheritance.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    public void testCreateBoss() {
        Boss testBoss = new Boss("Kádas Smaug", "2314 Kukutyin, Fő út 105.", 255_000, 3 );

        assertEquals("Kádas Smaug", testBoss.getName());
        assertEquals("2314 Kukutyin, Fő út 105.", testBoss.getAddress());
        assertEquals(331_500, testBoss.getSalary());
        assertEquals(3, testBoss.getNumberOfEmployees());
    }

    @Test
    public void testCreateBigBoss() {
        BigBoss testBigBoss = new BigBoss("Oláh Szauron", "2314 Kukutyin, Fő út 100.", 350_000, 4, 27_500);

        assertEquals("Oláh Szauron", testBigBoss.getName());
        assertEquals("2314 Kukutyin, Fő út 100.", testBigBoss.getAddress());
        assertEquals(517_500, testBigBoss.getSalary());
        assertEquals(4, testBigBoss.getNumberOfEmployees());

    }
}