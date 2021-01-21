package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {


    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void accountsFileReader(String fileLocation) {
        Path file = Path.of(fileLocation);
        try {
            List<String> fileRows = Files.readAllLines(file);
            for (String row: fileRows) {
                String[] rowElement = row.split(";");
                BankAccount readBankAccount = new BankAccount(rowElement[0], rowElement[1], Integer.parseInt(rowElement[2]));
                bankAccounts.add(readBankAccount);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public void transactionExecutor(String fileLocation) {
        Path file = Path.of(fileLocation);
        try {
            List<String> transactionList = Files.readAllLines(file);
            for (String row: transactionList) {
                String[] rowElement = row.split(";");
                for (BankAccount account:bankAccounts) {
                    if (account.getAccountNumber().equals(rowElement[0])) {
                        account.setBalance(account.getBalance() + Integer.parseInt(rowElement[1]));
                    }
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

}
