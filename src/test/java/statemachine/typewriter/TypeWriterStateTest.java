package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    public void testNext() {

        assertEquals(TypeWriterState.TYPE_WRITER_STATE_UPPERCASE, TypeWriterState.TYPE_WRITER_STATE_LOWERCASE.next());
        assertEquals(TypeWriterState.TYPE_WRITER_STATE_LOWERCASE, TypeWriterState.TYPE_WRITER_STATE_UPPERCASE.next());
    }

}