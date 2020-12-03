package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {

    @Test
    public void testSumAmountOfCreditEntries() {
        List<Transaction> testTransactions = new ArrayList<>();
        testTransactions.add(new Transaction("TRN73950", TransactionOperation.CREDIT, 1_255_000));
        testTransactions.add(new Transaction("TRN73951", TransactionOperation.DEBIT, 745_000));
        testTransactions.add(new Transaction("TRN73952", TransactionOperation.CREDIT, 2_135_000));
        testTransactions.add(new Transaction("TRN73953", TransactionOperation.DEBIT, 1_500_000));

        TransactionSumCalculator tSC = new TransactionSumCalculator();

        assertEquals(3_390_000, tSC.sumAmountOfCreditEntries(testTransactions));

    }
}