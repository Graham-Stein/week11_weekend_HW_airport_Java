import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    private Ticket ticket;
    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bill");
        ticket = new Ticket("LSI004","Aberdeen", passenger);
    }

    @Test
    public void getTicketDestination(){
        assertEquals("Aberdeen", ticket.getDestination());
    }

    @Test
    public void customerHasName(){
        assertEquals("Bill", passenger.getName());
    }

    @Test
    public void getTicketFlightID(){
        assertEquals("LSI004", ticket.getTicketFlightID());
    }

}
