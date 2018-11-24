import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Ticket ticket;

    @Before
    public void before(){
        passenger = new Passenger("Bill");
        ticket = new Ticket("Aberdeen", passenger);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Bill", passenger.getName());
    }

}
