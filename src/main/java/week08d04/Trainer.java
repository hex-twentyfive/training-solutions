package week08d04;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark() {             //És legyen egy `int giveMark()` metódusa, mely továbbhív, azaz "delegál" a `CanMark` példány felé!
        return canMark.giveMark();
    }

}
