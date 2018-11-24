public class Ticket {

    private String destination;

    private Passenger passenger;

    public Ticket(String destination, Passenger passenger){
        this.destination = destination;
        this.passenger = passenger;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getName(){
        return this.passenger.getName();
    }

}
