package exam03retake01;

public class CdvCheck {

    public boolean check(String taxNumber) {
        validationHandling(taxNumber);
        String[] split = taxNumber.split("");
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(split[i]) * (i+1);
        }
        return (sum % 11) == Integer.parseInt(split[9]);
    }

    private void validationHandling(String taxNumber) {
        if (taxNumber.length() != 10 || !taxNumber.matches("[0-9]+")) {
            throw new IllegalArgumentException("Wrong input number! --> " + taxNumber);
        }
    }

}