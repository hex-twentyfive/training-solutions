package staticattrmeth.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @BeforeEach
    public void setUp() {
        BankTransaction.initTheDay();
    }

    @Test
    public void testBankTransactionSingle() {

        long testTransactionOver = 5_000_000;
        BankTransaction bT = new BankTransaction(testTransactionOver);

        long expectedValue = 5_000_000;

        assertEquals(expectedValue, bT.getTransactionValue());
        assertEquals(expectedValue, BankTransaction.getCurrentMinValue());
        assertEquals(expectedValue, BankTransaction.getCurrentMaxValue());
        assertEquals(new BigDecimal(expectedValue), BankTransaction.getSumOfTrxs());
        assertEquals(new BigDecimal(expectedValue), BankTransaction.averageOfTransaction());
    }

    @Test
    public void testBankTransactionMulti() {

        long testTransaction1 = 5_000_000;
        long testTransaction2 = 2_500_000;
        long testTransaction3 = 7_500_000;
        new BankTransaction(testTransaction1);
        new BankTransaction(testTransaction2);
        new BankTransaction(testTransaction3);

        assertEquals(2_500_000, BankTransaction.getCurrentMinValue());
        assertEquals(7_500_000, BankTransaction.getCurrentMaxValue());
        assertEquals(new BigDecimal(15_000_000), BankTransaction.getSumOfTrxs());
        assertEquals(new BigDecimal(5_000_000), BankTransaction.averageOfTransaction());
    }

    @Test
    public void testBankTransactionWithZero() {

        long expectedValue = 0;

        assertEquals(expectedValue, BankTransaction.getCurrentMinValue());
        assertEquals(expectedValue, BankTransaction.getCurrentMaxValue());
        assertEquals(new BigDecimal(expectedValue), BankTransaction.getSumOfTrxs());
    }

    @Test
    public void testBankTransactionWithIllegalParameters() {

        long testTransactionOver = 10_000_001;
        long testTransactionUnder = -1;

        assertThrows(IllegalArgumentException.class, ()->new BankTransaction(testTransactionOver));
        assertThrows(IllegalArgumentException.class, ()->new BankTransaction(testTransactionUnder));

    }
}