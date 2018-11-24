import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Hangar hangar;
    private Hangar hangar1;

    private Aircraft aircraft;
    private Aircraft aircraft1;
    private Aircraft aircraft2;

    @Before
    public void before(){
        hangar = new Hangar("Virkie", 5);
        hangar1 = new Hangar("Sella Ness", 4);

        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        aircraft1 = new Aircraft("G-REDN", AircraftType.Saab2000);
        aircraft2 = new Aircraft("G-VINC", AircraftType.Embraer145);
    }

    @Test
    public void canGetNumberOfParkingSpacesInHangar(){
        assertEquals(5, hangar.getAircraftParkingCapacity());
    }

    @Test
    public void canGetHangarName(){
        assertEquals("Sella Ness", hangar1.getHangarName());
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(5, hangar.getNumberOfRemainingSpaces());
    }

    @Test
    public void canAddAircraftToHangar(){
        hangar.addAircraft(aircraft);
        hangar.addAircraft(aircraft1);
        hangar.addAircraft(aircraft2);
        assertEquals(2, hangar.getNumberOfRemainingSpaces());
    }
}


