package algorithmssum.sales;

import algorithmssum.sales.SalesAmountSumCalculator;
import algorithmssum.sales.Salesperson;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    void testSalesAmountSumCalculator() {
        List<Salesperson> salesPersons = new ArrayList<>();
        salesPersons.add(new Salesperson("Lakatos Frodó", 13_575_000));
        salesPersons.add(new Salesperson("Oláh Legolas", 7_125_000));
        salesPersons.add(new Salesperson("Kádas Smaug", 8_550_000));

        SalesAmountSumCalculator sASC = new SalesAmountSumCalculator();

        assertEquals(29_250_000,sASC.salesAmountSumCalculator(salesPersons));
    }
}
