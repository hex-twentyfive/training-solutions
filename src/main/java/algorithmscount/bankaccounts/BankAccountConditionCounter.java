package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int accountCounterByFilter(List<BankAccount> bankAccounts, int limitNumber) {
        int filteredCunter = 0;
        for (BankAccount element: bankAccounts) {
            if (element.getBalance() > limitNumber) {
                filteredCunter++;
            }
        }
        return filteredCunter;
    }
}
