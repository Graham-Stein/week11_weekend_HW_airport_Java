import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airport;
    private Hangar hangar;
    private Hangar hangar1;
    private Aircraft aircraft;
    private Flight flight;

    @Before
    public void before(){
        airport = new Airport("EGPB");

        hangar = new Hangar("Virkie", 5);
        hangar1 = new Hangar("Sella Ness", 4);

        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        flight = new Flight("LSI001", "Aberdeen", aircraft );
    }

    @Test
    public void hasAirportIdentifier(){
        assertEquals("EGPB", airport.getAirportID());
    }

    @Test
    public void hangarListStartsEmpty(){
        assertEquals(0, airport.getHangars().size());
    }

    @Test
    public void canAddHangars(){
        airport.addHangar(hangar);
        airport.addHangar(hangar1);
        assertEquals(2, airport.getHangars().size());
    }

    @Test
    public void canAddFlights(){
        airport.addFlight(flight);
        assertEquals(1, airport.getFlights().size());
    }
}