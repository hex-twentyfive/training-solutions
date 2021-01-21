package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    TransactionManager access = new TransactionManager();
    String accountFileLocation = "src/main/resources/accounts.txt";
    String transactionFileLocation = "src/main/resources/transactions.txt";


    @Test
    public void testAccountFileReader() {
        assertEquals(0, access.getBankAccounts().size());

        int expectedBankAccountSize = 5;
        int expectedAccountBalance = 720_010;

        access.accountsFileReader(accountFileLocation);

        assertEquals(expectedBankAccountSize, access.getBankAccounts().size());
        assertEquals(expectedAccountBalance, access.getBankAccounts().get(3).getBalance());
    }

    @Test
    public void testTransactionExecutor() {
        access.accountsFileReader(accountFileLocation);

        int expectedAccountBalance = 720_010 + 1200 + 10;

        access.transactionExecutor(transactionFileLocation);

        assertEquals(expectedAccountBalance, access.getBankAccounts().get(3).getBalance());
    }

}