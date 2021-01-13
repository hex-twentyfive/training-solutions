package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList {


    public static final int COMMENT_LINE = -1;


    public List<String> processLines(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException("Empty list is not acceptable!");
        }
        List<String> errorsList = new ArrayList<>();
        for (String row: lines) {
            String[] rowElements = row.split(",");
            int rowElementRowNumber = readLineRowNumber(rowElements[0]);
            if (rowElementRowNumber != COMMENT_LINE) {
                ProcessingResult errorTesting = processRow(rowElements);
                if (errorTesting != ProcessingResult.NO_ERROR) {
                    errorsList.add(errorLine(rowElementRowNumber, errorTesting.getCode()));
                }
            }
        }
        return errorsList;
    }


    private int readLineRowNumber(String rowNumber) {
        try {
        return Integer.parseInt(rowNumber);
        }
        catch (NumberFormatException nfe) {
            return COMMENT_LINE;
        }
    }


    private ProcessingResult processRow(String[] row) {
        if (row.length != 3) {
            return ProcessingResult.WORD_COUNT_ERROR;
        }

        boolean rowElementRowValueValidation = isRowValueValid(row[1]);
        boolean rowElementRowDateValidation = isRowDateValid(row[2]);

        if (!rowElementRowValueValidation && !rowElementRowDateValidation) {
            return ProcessingResult.VALUE_AND_DATE_ERROR;
        }
        else if (!rowElementRowValueValidation) {
            return ProcessingResult.VALUE_ERROR;
        }
        else if (!rowElementRowDateValidation) {
            return ProcessingResult.DATE_ERROR;
        }
        return ProcessingResult.NO_ERROR;
    }


    private boolean isRowValueValid(String valueElement) {
        try {
            Double.parseDouble(valueElement);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }


    private boolean isRowDateValid(String dateElement) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.");
            dateFormat.parse(dateElement);
            return true;
        }
        catch (ParseException pE) {
            return false;
        }
    }


    private String errorLine(int rowNumber, int errorCode) {
        return rowNumber + "," + errorCode;
    }


}
