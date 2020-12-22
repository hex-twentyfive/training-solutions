package interfaces.simplethread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleThreadTest {

    @Test
    public void testNextStepWithNonEmptyList() {
        List<String> testTask = new ArrayList<>(List.of("aaa","bbb","ccc","ddd"));

        SimpleThread sT = new SimpleThread(testTask);

        assertEquals(4, sT.getTasks().size());

        sT.run();

        assertEquals(0, sT.getTasks().size());
    }

    @Test
    public void testNextStepWithEmptyList() {
        List<String> testTask = new ArrayList<>(List.of());

        SimpleThread sT = new SimpleThread(testTask);

        assertEquals(0, sT.getTasks().size());

        sT.run();

        assertEquals(0, sT.getTasks().size());
    }

}