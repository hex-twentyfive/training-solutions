package staticattrmeth.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankTransaction {


    private long transactionValue;

    private static long currentMinValue;
    private static long currentMaxValue;
    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long transactionCounter = 0;
    private static BigDecimal sumOfTransaction = new BigDecimal("0");

    public BankTransaction(long transactionValue) {
        if ( transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE ) {
            throw new IllegalArgumentException("The value of the transaction is not acceptable! " + transactionValue);
        }
        transactionCounter++;
        sumOfTransaction = sumOfTransaction.add(new BigDecimal(Long.toString(transactionValue)));
        if (transactionValue < currentMinValue) {
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }
        this.transactionValue = transactionValue;
    }

    public static void initTheDay() {       //inicializálja a kezdőértékeket a nap elején
        transactionCounter = 0;
        sumOfTransaction = new BigDecimal("0");
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }

    public static BigDecimal averageOfTransaction() {
        return transactionCounter == 0 ?
                new BigDecimal("0") :
                sumOfTransaction.divide(new BigDecimal(Long.toString(transactionCounter)), 0, RoundingMode.HALF_UP);
    }

    public static long getCurrentMinValue() {
        return  transactionCounter == 0 ?
                0 :
                currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return  transactionCounter == 0 ?
                0 :
                currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return sumOfTransaction;
    }

    public long getTransactionValue() {
        return transactionValue;
    }

}
