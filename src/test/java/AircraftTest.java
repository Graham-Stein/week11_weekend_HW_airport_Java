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
    public void canGetMaxSeatingCapacity(){
        assertEquals(50, aircraft.getMaxSeatCapacity());
    }

    @Test
    public void canGetAircraftType(){
        assertEquals(AircraftType.Saab2000, aircraft.getAircraftType());
    }
}
