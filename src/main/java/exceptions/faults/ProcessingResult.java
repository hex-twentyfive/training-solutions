package exceptions.faults;

public enum ProcessingResult {
    NO_ERROR(0),
    COMMENT(1),
    WORD_COUNT_ERROR(2),        //a sor nem bontható 3 db , karakterrel elválaszható részre.
    VALUE_ERROR(4),             //a második rész nem double szám
    DATE_ERROR(8),              //a harmadik rész nem yyyy.MM.dd. alakú dátum
    VALUE_AND_DATE_ERROR(12);   //egyszerre van VALUE_ERROR és DATE_ERROR is

    private int code;

    ProcessingResult(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
