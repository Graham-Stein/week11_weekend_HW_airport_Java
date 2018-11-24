import java.util.ArrayList;

public class Flight {

    private String flightID;
    private Aircraft aircraft;
    private String destination;
    private ArrayList<Ticket> manifest;
    private Ticket ticket;

    public Flight(String flightID, String destination, Aircraft aircraft){
        this.flightID = flightID;
        this.aircraft = aircraft;
        this.destination = destination;
        this.manifest = new ArrayList<>();
    }

    public String getID() {
        return this.flightID;
    }

    public AircraftType getAircraftType() {
        return this.aircraft.getAircraftType();
    }

    public int getMaxSeatingCapacity(){
        return this.aircraft.getMaxSeatCapacity();
    }

    public String getDestination() {
        return this.destination;
    }

    public void addTicketToManifest(Ticket ticket){
        this.manifest.add(ticket);
    }

    public ArrayList getManifest() {
        return this.manifest;
    }
}
