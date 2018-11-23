import java.util.HashMap;

public class Passenger {

    private String name;
    private Ticket ticket;

    public Passenger(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public String getTicketDestination() {
        return this.ticket.getDestination();
    }
}
