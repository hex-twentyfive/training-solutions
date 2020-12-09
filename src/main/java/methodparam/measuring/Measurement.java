package methodparam.measuring;

public class Measurement {

   private double[] measurements;

    public Measurement(double[] measurements) {
        this.measurements = measurements;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        for (int i = 0 ; i < measurements.length ; i++ ) {
            if ( measurements[i] < upper && measurements[i] > lower ) {
                return i;
            }
        }
        return -1;
    }

    public double minimum() {
        double lowestMeasurement = measurements[0];
        for (double element: measurements) {
            if ( element < lowestMeasurement ) {
                lowestMeasurement = element;
            }
        }
        return lowestMeasurement;
    }

   public double maximum()  {
        double highestMeasurement = measurements[0];
        for (double element: measurements) {
            if ( element > highestMeasurement) {
                highestMeasurement = element;
            }
        }
        return highestMeasurement;
   }

    public ExtremValues minmax() {
        return new ExtremValues(minimum(), maximum());
    }

}
