package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int transactionCounterUnderLimit(List<Transaction> transactions, int limitAmount) {
        int filteredCounter = 0;
        for(Transaction element: transactions) {
            if (element.getAmount() < limitAmount) {
                filteredCounter++;
            }
        }
        return filteredCounter;
    }
}
