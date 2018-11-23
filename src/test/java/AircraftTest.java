import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AircraftTest {

    Aircraft aircraft;

    @Before
    public void before(){
        aircraft = new Aircraft(AircraftType.Saab2000);
    }

    @Test
    public void test(){
        assertEquals(50, aircraft.getMaxSeatCapacity());
    }
}
