package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionCounterTest {

    @Test
    public void testTransactionCounterUnderLimit() {

        List<Transaction> testTransactions = new ArrayList<>();
        testTransactions.add(new Transaction("TRN73950", TransactionType.DEBIT, 6_351_911));
        testTransactions.add(new Transaction("TRN73951", TransactionType.CREDIT, 1_095_150));
        testTransactions.add(new Transaction("TRN73952", TransactionType.DEBIT, 2_576_800));
        int limitAmount1 = 10_000_000;
        int limitAmount2 = 1_500_000;

        TransactionCounter tC = new TransactionCounter();

        assertEquals(3, tC.transactionCounterUnderLimit(testTransactions, limitAmount1));
        assertEquals(1, tC.transactionCounterUnderLimit(testTransactions, limitAmount2));
    }
}
