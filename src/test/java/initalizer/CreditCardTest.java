package initalizer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    public final Rate[] rates = {
            new Rate(Currency.HUF, 1.0),
            new Rate(Currency.EUR, 353.49),
            new Rate(Currency.SFR, 328.17),
            new Rate(Currency.GBP, 390.3),
            new Rate(Currency.USD, 290.94)
    };

    @Test
    public void testConstructorWithThreeParameters() {
        CreditCard testNewCreditCard = new CreditCard(10_000, Currency.USD, Arrays.asList(rates));
        long expectedBalanceInHuf = 2_909_400;

        assertEquals(expectedBalanceInHuf, testNewCreditCard.getBalance());
    }

    @Test
    public void testConstructorWithOneParameter() {
        CreditCard testNewCreditCard = new CreditCard(1_000_000);
        long expectedBalanceInHuf = 1_000_000;

        assertEquals(expectedBalanceInHuf, testNewCreditCard.getBalance());
    }

    @Test
    public void testPaymentWithTwoParameters() {
        CreditCard testCreditCardPayment = new CreditCard(1_000_000, Currency.HUF, Arrays.asList(rates));
        long expectedBalanceInHuf = 709_060;

        assertTrue(testCreditCardPayment.payment(1_000, Currency.USD));

        assertEquals(expectedBalanceInHuf, testCreditCardPayment.getBalance());
    }

    @Test
    public void testPaymentWithOneParameter() {
        CreditCard testCreditCardPayment = new CreditCard(1_000_000, Currency.HUF, Arrays.asList(rates));
        long expectedBalanceInHuf = 900_000;

        assertTrue(testCreditCardPayment.payment(100_000));

        assertEquals(expectedBalanceInHuf, testCreditCardPayment.getBalance());
    }

    @Test
    public void testPaymentWithOneParameterFalseTest() {
        CreditCard testCreditCardPayment = new CreditCard(1_000_000, Currency.HUF, Arrays.asList(rates));
        long expectedBalanceInHuf = 1_000_000;

        assertFalse(testCreditCardPayment.payment(1_100_000));
        assertEquals(expectedBalanceInHuf, testCreditCardPayment.getBalance());
    }

}