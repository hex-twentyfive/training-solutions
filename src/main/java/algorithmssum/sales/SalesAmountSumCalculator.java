package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int salesAmountSumCalculator(List<Salesperson> salesPersons) {
        int sumAmount = 0;
        for (Salesperson element: salesPersons) {
            sumAmount += element.getAmount();
        }
        return sumAmount;
    }

}
