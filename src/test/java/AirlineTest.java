import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirlineTest {

    private Airline airline;
    private Airline airline1;

    private Aircraft aircraft;
    private Aircraft aircraft1;
    private Aircraft aircraft2;

    private Hangar hangar;

    private Flight flight;

    private Passenger passenger;



    @Before
    public void before(){
        airline = new Airline("Scumbag Airways");
        airline1 = new Airline("Shetland Air");

        hangar = new Hangar("Virkie", 5);

        aircraft = new Aircraft("G-REDP", AircraftType.Embraer135);
        aircraft1 = new Aircraft("G-REDN", AircraftType.Saab2000);
        aircraft2 = new Aircraft("G-VINC", AircraftType.Embraer145);

        flight = new Flight("LSI001", "Aberdeen", aircraft );

        passenger = new Passenger("Bill");

    }

    @Test
    public void getAirlineName(){
        assertEquals("Scumbag Airways", airline.getName());
    }

    @Test
    public void canAddAircraftToHangar(){
        airline.addAircraftToHangar(aircraft, hangar);
        airline.addAircraftToHangar(aircraft1, hangar);
        airline.addAircraftToHangar(aircraft2, hangar);
        assertEquals(2, hangar.getNumberOfRemainingSpaces());
    }

    @Test
    public void canSellTicketToCustomerAndAddToManifest(){
        airline.sellTicket("Aberdeen", passenger, flight);
        assertEquals(1, flight.getManifest().size());
    }

}
