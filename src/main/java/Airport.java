import java.util.ArrayList;

public class Airport {

    private String airportID;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(String ID){
        this.airportID = ID;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public String getAirportID() {
        return this.airportID;
    }

    public ArrayList getHangars(){
        return this.hangars;
    }

    public void addHangar(Hangar hangar){
        this.hangars.add(hangar);
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public ArrayList getFlights(){
        return this.flights;
    }

//    CHECK TICKET - Take ticket and check if flight has that ticket on the manifest return boolean.
}
