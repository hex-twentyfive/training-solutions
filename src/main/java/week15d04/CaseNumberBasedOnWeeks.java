package week15d04;

public class CaseNumberBasedOnWeeks {

    private String weeks;
    private int caseNumbers;

    public CaseNumberBasedOnWeeks(String weeks, int caseNumbers) {
        this.weeks = weeks;
        this.caseNumbers = caseNumbers;
    }

    public String getWeeks() {
        return weeks;
    }

    public int getCaseNumbers() {
        return caseNumbers;
    }

    @Override
    public String toString() {
        return "caseNumberBasedOnWeeks{" +
                "weeks='" + weeks + '\'' +
                ", caseNumbers=" + caseNumbers +
                '}';
    }

}