package methodvarargs.examstats;

public class ExamStats {

    private double maximumNumberOfPoints;

    public ExamStats(double maximumNumberOfPoints) {
        this.maximumNumberOfPoints = maximumNumberOfPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {       //visszaadja a megfelelt vizsgák számát

        if ( results == null || results.length == 0 ) {
            throw new IllegalArgumentException("Empty results is not allowed!");
        }

        int numberOfExamsPassed = 0;
        for (int element : results) {
            if (element > (limitInPercent * 0.01) * maximumNumberOfPoints )
                numberOfExamsPassed++;
        }
        return numberOfExamsPassed;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {

        if ( results == null || results.length == 0 ) {
            throw new IllegalArgumentException("Empty results is not allowed!");
        }

        int numberOfExamsFailed = 0;
        for (int element : results) {
            if (element < (limitInPercent * 0.01) * maximumNumberOfPoints )
                return true;
        }
        return false;
    }

}
