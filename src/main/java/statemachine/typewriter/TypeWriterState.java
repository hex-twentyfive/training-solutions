package statemachine.typewriter;

public enum TypeWriterState {

    TYPE_WRITER_STATE_UPPERCASE {
        TypeWriterState next() {
            return TypeWriterState.TYPE_WRITER_STATE_LOWERCASE;
        }
    },
    TYPE_WRITER_STATE_LOWERCASE {
        TypeWriterState next() {
            return TypeWriterState.TYPE_WRITER_STATE_UPPERCASE;
        }
    };

    abstract TypeWriterState next();

}
