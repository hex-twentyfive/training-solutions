package week08d04;

public class Main {

    public static void main(String[] args) {

        Trainer goodMoodTrainer = new Trainer(new GoodMood());

        Trainer badMoodTrainer = new Trainer(new BadMood());

        System.out.println(goodMoodTrainer.giveMark());

        System.out.println(badMoodTrainer.giveMark());
    }

}
