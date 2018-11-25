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
    private Ticket ticket;
    private Passenger passenger;
    private Passenger passenger1;
    private String flightID;

    @Before
    public void before(){
        airport = new Airport("EGPB");

        hangar = new Hangar("Virkie", 5);
        hangar1 = new Hangar("Sella Ness", 4);

        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        flight = new Flight("LSI001", "Aberdeen", aircraft );

        passenger = new Passenger("Bill");
        passenger1 = new Passenger("Ted");
        ticket = new Ticket("LSI001","Aberdeen", passenger);

        flightID = "LSI001";
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

    @Test
    public void canCheckPassengerOnToFlight(){
        airport.addFlight(flight);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        assertEquals("Bill", flight.getPassengersOnAircraft().get(0));
    }

    @Test
    public void canFindFlightByIDFromFlightsArrayList(){
        airport.addFlight(flight);
        Flight actual = airport.findMatchingFlightByID("LSI001");
        assertEquals(flight, actual);
    }

    @Test
    public void flightByIDFromFlightsArrayListReturnsVoidIfNotPresent(){
        airport.addFlight(flight);
        Flight actual = airport.findMatchingFlightByID("LSI002");
        assertEquals(null, actual);
    }

    @Test
    public void passengerNameMatchesTicket(){
        Boolean testValue = airport.passengerNameMatchesTicket(ticket, passenger);
        assertEquals(true, testValue);
    }

    @Test
    public void passengerNameDoesNotMatchTicket(){
        Boolean testValue = airport.passengerNameMatchesTicket(ticket, passenger1);
        assertEquals(false, testValue);
    }

}