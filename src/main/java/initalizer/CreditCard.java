package initalizer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();       //A hitelkártya "használatba vételekor" (CreditCard osztály betöltése) az aktuális átváltási faktorok (Rate) feltöltésre kerülnek a CreditCard osztályba, egy statikus final listába (statikus inicializálás).
    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> upload) {
        ACTUAL_RATES.addAll(upload);
        this.balance = Math.round(balance * getConversionRate(currency));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {        //A kiadás payment() többféle valutában is lehetséges, ezeket a rendszer egész forintra konvertálja és így terheli meg a kártyát.
        long value = Math.round(amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {           //Ha nem adunk meg valutát, automatikusan forintnak veszi a terhelést.
        return payment(amount, Currency.HUF);
    }

    private double getConversionRate(Currency currency) {
        for (Rate element: ACTUAL_RATES) {
            if (element.getCurrency() == currency) {
                return element.getConversionFactor();
            }
        }
        return 1.0;
    }

}
