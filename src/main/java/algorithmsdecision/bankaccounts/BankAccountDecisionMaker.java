package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean bankAccountDecisionMaker(List<BankAccount> bankAccounts, int lowerLimitNumber) {
        for (BankAccount element: bankAccounts) {
            if (element.getBalance() > lowerLimitNumber) {
                return true;
            }
        }
        return false;
    }
}


//    Feladat egy metódus megírása, ami eldönti van-e olyan számla,
//    amelynek az aktuális egyenlege meghaladja
//    a paraméterként kapott alsó határt.