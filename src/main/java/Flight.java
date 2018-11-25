import java.util.ArrayList;

public class Flight {

    private String flightID;
    private Aircraft aircraft;
    private String destination;
    private ArrayList<Ticket> manifest;
    private Ticket ticket;
    private ArrayList<Ticket> passengersOnAircraft;

    public Flight(String flightID, String destination, Aircraft aircraft){
        this.flightID = flightID;
        this.aircraft = aircraft;
        this.destination = destination;
        this.manifest = new ArrayList<>();
        this.passengersOnAircraft = new ArrayList<>();
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
        if (this.manifest.size() < this.aircraft.getMaxSeatCapacity()) {
            this.manifest.add(ticket);
        }
        return;
    }

    public ArrayList getManifest() {
        return this.manifest;
    }
}
