package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson salespersonWithFurthestAboveTargetSelector(List<Salesperson> salesPersons) {
        Salesperson salespersonFilter = null;
        for (Salesperson element: salesPersons ) {
            if ( salespersonFilter == null || (element.getAmount() - element.getTarget()) > (salespersonFilter.getAmount() - salespersonFilter.getTarget()) ) {
                salespersonFilter = element;
            }
        }
        return salespersonFilter;
    }
}
