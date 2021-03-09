package week15d01;

/*  Adott egy függvénygrafikon a koordináta rendszerben. A grafikon néhány pontját megkapjuk egy Map-ben.
    A map kulcsa az x koordináta értéke pedig az y koordináta. Döntsük el, hogy a kapott pontok küzül,
    hol van a függvénynek maximum helye és ott mennyi az értéke.
 */

import java.util.HashMap;
import java.util.Map;

public class FunctionAnalysis {

    public Map<Double, Double> returnsTheMaximumValueOfTheFunction(Map<Double, Double> graph) {
        if ( graph.isEmpty()) {
            throw new IllegalArgumentException("<!> Parameter with empty value is not allowed! <!>");
        }
        Map<Double, Double> result = new HashMap<>();
        double x = 0;
        double y = 0;
        for (Map.Entry<Double, Double> entry : graph.entrySet()) {
            if (entry.getValue() > y) {
                x = entry.getKey();
                y = entry.getValue();
            }
        }
        result.put(x, y);
        return result;
    }


    public Map.Entry<Double, Double> returnsTheMaximumValueOfTheFunctionWithEntryMap(Map<Double, Double> graph) {
        if ( graph.isEmpty()) {
            throw new IllegalArgumentException("<!> Parameter with empty value is not allowed! <!>" );
        }
        Map.Entry<Double, Double> result = null;
        for (Map.Entry<Double, Double> entry: graph.entrySet()) {
            if( result == null || entry.getValue() > result.getValue()) {
                result = entry;
            }
        }
        return result;
    }


}