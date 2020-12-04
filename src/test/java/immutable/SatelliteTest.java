package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SatelliteTest {

    @Test
    public void emptyParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Satellite(new CelestialCoordinates(10, 10, 25), ""));
        assertEquals("Register ident must not be empty!", ex.getMessage());
    }

    @Test
    public void testModifyDestination() {
        // Given
        Satellite satellite = new Satellite(new CelestialCoordinates(10, 10, 25), "AAA001");
        // When
        satellite.modifyDestination(new CelestialCoordinates(5, 5, 5));
        //Then
        assertEquals("AAA001: CelestialCoordinates: x=15, y=15, z=30", satellite.toString());
    }
}

