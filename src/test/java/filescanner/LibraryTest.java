package filescanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    @Test
    public void testLoadFromFile() {

        Library library = new Library();

        library.loadFromFile();

        assertEquals(4, library.getBooks().size());
        assertEquals("A tér és az idő természete",library.getBooks().get(1).getTitle());

    }

}
