import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Ticket ticket;

    @Before
    public void before(){
        passenger = new Passenger("Bill");
        ticket = new Ticket("Aberdeen");
    }

    @Test
    public void customerHasName(){
        assertEquals("Bill", passenger.getName());
    }

    @Test
    public void canAllocateTicketToCustomer(){
        passenger.setTicket(ticket);
        assertEquals("Aberdeen", passenger.getTicketDestination());
    }
}
