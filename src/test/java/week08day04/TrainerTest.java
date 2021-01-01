package week08day04;

import org.junit.jupiter.api.Test;
import week08d04.BadMood;
import week08d04.GoodMood;
import week08d04.Trainer;

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