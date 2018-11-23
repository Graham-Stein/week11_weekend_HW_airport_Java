import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    private Ticket ticket;

    @Before
    public void before(){
        ticket = new Ticket("Aberdeen");
    }

    @Test
    public void getTicketDestination(){
        assertEquals("Aberdeen", ticket.getDestination());
    }
}
