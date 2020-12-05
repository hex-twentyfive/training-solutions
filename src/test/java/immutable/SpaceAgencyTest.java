package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpaceAgencyTest {

    @Test
    public void nullParameterShouldThrowException() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class, () -> new SpaceAgency().registerSatellite(null));
        assertEquals("Parameter must not be null!", ex.getMessage());
    }

    @Test
    public void testRegisterSatellite() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(10, 10, 25), "NCC746")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(20, 20, 35), "NCC170")));
        //Then
        assertEquals("[NCC746: CelestialCoordinates: x=10, y=10, z=25, NCC170: CelestialCoordinates: x=20, y=20, z=35]", sa.toString());
    }

    @Test
    public void testNotFoundSatelliteByRegisterIdent() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new SpaceAgency().findSatelliteByRegisterIdent("NCC746"));
        assertEquals("Satellite with the given registration cannot be found! --> NCC746", ex.getMessage());
    }

    @Test
    public void testFindSatelliteByRegisterIdent() {
        // Given
        SpaceAgency sa = new SpaceAgency();
        // When
        sa.registerSatellite((new Satellite(new CelestialCoordinates(10, 10, 25), "NCC746")));
        sa.registerSatellite((new Satellite(new CelestialCoordinates(20, 20, 35), "NCC170")));
        //Then
        assertEquals("NCC170: CelestialCoordinates: x=20, y=20, z=35", sa.findSatelliteByRegisterIdent("NCC170").toString());
    }

}
