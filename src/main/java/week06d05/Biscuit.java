package week06d05;

public class Biscuit {

    private BiscuitType biscuitType;
    private int gramAmount;

    public Biscuit(BiscuitType biscuitType, int gramAmount) {
        this.biscuitType = biscuitType;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getBiscuitType() {
        return biscuitType;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {         //visszaad nekünk egy új Biscuit példányt
        return new Biscuit(biscuitType, gramAmount);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(biscuitType.toString());
        sb.append(": ");
        sb.append(gramAmount);
        sb.append(" g");
        return sb.toString();
    }
}
