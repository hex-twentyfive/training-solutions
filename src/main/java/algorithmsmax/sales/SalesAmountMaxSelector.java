package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson salesAmountMaxSelector(List<Salesperson> salespersons) {                //•	kiválasztja a legnagyobb árbevételt elért értékesítőt
        Salesperson salespersonWithMaxAmount = null;
        for (Salesperson element: salespersons) {
            if ( salespersonWithMaxAmount == null || element.getAmount() > salespersonWithMaxAmount.getAmount() ) {
                salespersonWithMaxAmount = element;
            }
        }
        return salespersonWithMaxAmount;
    }
}
