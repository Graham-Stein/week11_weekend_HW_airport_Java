import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Aircraft aircraft;
    private Ticket ticket;
    private Passenger passenger;

    @Before
    public void setup(){
        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        flight = new Flight("LSI001", "Aberdeen", aircraft );

        passenger = new Passenger("Bill");
        ticket = new Ticket("LSI001","Aberdeen", passenger);
    }

    @Test
    public void hasEmptyManifest(){
        assertEquals(0, flight.getManifest().size());
    }

    @Test
    public void hasFlightID(){
        assertEquals("LSI001", flight.getID());
    }

    @Test
    public void hasDestination(){
        assertEquals("Aberdeen", flight.getDestination());
    }

    @Test
    public void hasAircraftType(){
        assertEquals(AircraftType.Embraer135, flight.getAircraftType());
    }

    @Test
    public void hasMaxSeatingCapacity(){
        assertEquals(37, flight.getMaxSeatingCapacity());
    }

    @Test
    public void canAddTicketToManifest(){
        for (int i = 0; i < (aircraft.getMaxSeatCapacity() + 2); i++) {
            flight.addTicketToManifest(ticket);
        }
        assertEquals(37, flight.getManifest().size());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(ticket);
        assertEquals("Bill", flight.getPassengersOnAircraft().get(0).getName());
    }
}
