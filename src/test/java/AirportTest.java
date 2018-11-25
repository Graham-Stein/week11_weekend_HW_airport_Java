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
    private Flight flight1;
    private Ticket ticket;
    private Ticket ticket1;
    private Ticket ticket2;
    private Passenger passenger;
    private Passenger passenger1;
    private String flightID;
    private String flightID1;

    @Before
    public void before(){
        airport = new Airport("EGPB");

        hangar = new Hangar("Virkie", 5);
        hangar1 = new Hangar("Sella Ness", 4);

        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        flight = new Flight("LSI001", "Aberdeen", aircraft );
        flight1 = new Flight("LSI003", "Aberdeen", aircraft );

        passenger = new Passenger("Bill");
        passenger1 = new Passenger("Ted");
        ticket = new Ticket("LSI001","Aberdeen", passenger);
        ticket1 = new Ticket("LSI003","Bergen", passenger1);
        ticket2 = new Ticket("LSI001","Aberdeen", passenger1);

        flightID = "LSI001";
        flightID1 = "LSI003";
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
        flight.addTicketToManifest(ticket);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        String paxName = flight.getPassengersOnAircraft().get(0).getName();
        assertEquals("Bill", paxName);
    }

    @Test
    public void canCheckMultiplePassengersOnToFlight(){
        airport.addFlight(flight);
        flight.addTicketToManifest(ticket);
        flight.addTicketToManifest(ticket2);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        airport.checkPassengerOnToFlight(flightID, ticket2, passenger1);
        assertEquals(2, flight.getPassengersOnAircraft().size());
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

    @Test
    public void passengerTicketMatchesManifestItem(){
        airport.addFlight(flight);
        flight.addTicketToManifest(ticket);
        Boolean testValue = airport.passengerTicketMatchesManifestItem(ticket, flight.getManifest());
        assertEquals(true, testValue);
    }

    @Test
    public void hasEmptyHashmap(){
        assertEquals(0, airport.getTotalPassengers("Aberdeen"));
    }

    @Test
    public void canTrackNumbersOfPassengersPerDestination(){
        airport.addFlight(flight);
        flight.addTicketToManifest(ticket);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        airport.checkPassengerOnToFlight(flightID, ticket, passenger);
        assertEquals(5, airport.getTotalPassengers("Aberdeen"));
    }

    @Test
    public void canTrackNumbersOfPassengersPerOtherDestination(){
        airport.addFlight(flight1);
        flight1.addTicketToManifest(ticket1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        airport.checkPassengerOnToFlight(flightID1, ticket1, passenger1);
        assertEquals(6, airport.getTotalPassengers("Bergen"));
    }

}