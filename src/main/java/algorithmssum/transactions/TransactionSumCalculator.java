package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int filteredSum = 0;
        for (Transaction element: transactions) {
            if (element.isCredit()) {
                filteredSum += element.getAmount();
            }
        }
        return filteredSum;
    }
}
