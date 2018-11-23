import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Hangar hangar;
    private Hangar hangar1;

    @Before
    public void before(){
        hangar = new Hangar("Virkie", 5);
        hangar1 = new Hangar("Sella Ness", 4);
    }

    @Test
    public void canGetNumberOfParkingSpacesInHangar(){
        assertEquals(5, hangar.getAircraftParkingSpaces());
    }

    @Test
    public void canGetHangarName(){
        assertEquals("Sella Ness", hangar1.getHangarName());
    }
}
