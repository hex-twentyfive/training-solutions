package week06d05;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiscuitTest {

    @Test
    public void testToString() {
        Assertions.assertEquals("PILÓTA: 100 g", Biscuit.of(BiscuitType.PILÓTA, 100).toString());
    }
}
