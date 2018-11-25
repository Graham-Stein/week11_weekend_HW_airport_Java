public class Ticket {

    private String destination;

    private Passenger passenger;

    private String ticketFlightID;

    public Ticket(String ticketFlightID, String destination, Passenger passenger){
        this.destination = destination;
        this.passenger = passenger;
        this.ticketFlightID = ticketFlightID;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getName(){
        return this.passenger.getName();
    }

    public String getTicketFlightID(){
        return this.ticketFlightID;
    }

}
