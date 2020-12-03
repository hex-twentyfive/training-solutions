package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAlgorithmsTest {

    List<Salesperson> testSalespersons = Arrays.asList(
            new Salesperson("Lakatos Frodó", 8_755_000, 6_500_000),
            new Salesperson("Oláh Legolas", 6_310_000, 4_500_000),
            new Salesperson("Kádas Smaug", 9_880_000, 11_750_000),
            new Salesperson("Panyika néni", 699_000, 1_200_000) );

    @Test
    public void testSalesAmountMaxSelector() {
        SalesAmountMaxSelector sAMS = new SalesAmountMaxSelector();

        assertEquals(9880000,sAMS.salesAmountMaxSelector(testSalespersons).getAmount());
    }

    @Test
    public void salespersonWithFurthestAboveTargetSelector() {
        SalespersonWithFurthestAboveTargetSelector sWFATS = new SalespersonWithFurthestAboveTargetSelector();

        assertEquals(2_255_000,sWFATS.salespersonWithFurthestAboveTargetSelector(testSalespersons).getDifferenceBetweenTargetAndAmount());
    }

    @Test
    public void salespersonWithFurthestBelowTargetSelector() {
        SalespersonWithFurthestBelowTargetSelector sWFBTS = new SalespersonWithFurthestBelowTargetSelector();

        assertEquals(-1_870_000, sWFBTS.SalespersonWithFurthestBelowTargetSelector(testSalespersons).getDifferenceBetweenTargetAndAmount());

    }

}
