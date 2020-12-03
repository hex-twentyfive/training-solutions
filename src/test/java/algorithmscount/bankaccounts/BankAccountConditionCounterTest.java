package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConditionCounterTest {

    @Test
    public void testAccountCounterByFilter() {

        List<BankAccount> testBankAccountList = new ArrayList<>();
        testBankAccountList.add(new BankAccount("Lakatos Frodó", "TRN73950",6_351_911));
        testBankAccountList.add(new BankAccount("Lakatos Frodó", "TRN73951",1_095_150));
        testBankAccountList.add(new BankAccount("Lakatos Frodó", "TRN73952",2_576_800));
        int limitNumber = 1_500_000;
        int limitNumber2 = 5_000_000;

        BankAccountConditionCounter bACC = new BankAccountConditionCounter();

        assertEquals(2, bACC.accountCounterByFilter(testBankAccountList,limitNumber));
        assertEquals(1,bACC.accountCounterByFilter(testBankAccountList,limitNumber2));
    }
}
