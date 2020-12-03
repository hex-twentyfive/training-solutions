package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountDecisionMakerTest {

    @Test
    public void testBankAccountDecisionMaker() {

        List<BankAccount> testBankAccounts = new ArrayList<>();
        testBankAccounts.add(new BankAccount("Lakatos Frodó", "TRN73950",6_351_911));
        testBankAccounts.add(new BankAccount("Oláh Legolas", "TRN73951",1_095_150));
        testBankAccounts.add(new BankAccount("Kádas Smaug", "TRN73952",2_576_800));
        int lowerLimitNumber1 = 1_000_000;
        int lowerLimitNumber2 = 5_000_000;
        int lowerLimitNumber3 = 10_000_000;

        BankAccountDecisionMaker bADM = new BankAccountDecisionMaker();

        assertEquals(true,bADM.bankAccountDecisionMaker(testBankAccounts,lowerLimitNumber1));
        assertEquals(true,bADM.bankAccountDecisionMaker(testBankAccounts,lowerLimitNumber2));
        assertEquals(false,bADM.bankAccountDecisionMaker(testBankAccounts,lowerLimitNumber3));

    }
}
