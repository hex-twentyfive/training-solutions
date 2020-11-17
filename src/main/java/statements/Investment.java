package statements;

public class Investment {

    private double cost = 0.3;        //kezelési költség
    private int fund;                 //alap
    private int interestRate;         //kamatláb
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {          //A getYield() metódusa megkapja, hogy hány napra kérik le a hozamot, és visszaadja az adott időszakra kiszámított hozam összegét.
        // return ( ( days / 365 ) * ( interestRate * 0.01 ) ) * fund;   // Na ez így nem működik valamiért! Talán mert számítás pillanatnyi értéke 1,0 alá megy???
        // return fund * ( interestRate * 0.01 ) * ( days / 365 );
        // return ( fund * interestRate * 0.01 ) / 365 * days;
        return ( fund * interestRate * 0.01 * days ) / 365;
    }

    public double close(int days) {
        double closeAmount = ( getFund() + getYield(days) ) * ( 1 - ( cost * 0.01 ) );
        double payoutAmount = active ? closeAmount : 0;
        active = false;
        return payoutAmount;
     }

    public boolean isActive() {
        return active;
    }
}
