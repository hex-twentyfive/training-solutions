package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testNewGoodMoodTrainer() {
        Trainer testGoodMoodTrainer = new Trainer(new GoodMood());
        int expectedResult = 5;

        assertEquals(expectedResult, testGoodMoodTrainer.giveMark());
    }

    @Test
    public void testNewBadMoodTrainer() {
        Trainer testBadMoodTrainer = new Trainer(new BadMood());
        int expectedResult = 3;

        assertEquals(expectedResult, testBadMoodTrainer.giveMark());
    }

}