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

    public void checkPassengerOnToFlight(String flightID, Ticket ticket, Passenger passenger) {

        Flight flight = findMatchingFlightByID(flightID);
        ArrayList<Ticket> flightManifest = flight.getManifest();

        Boolean match = passengerNameMatchesTicket(ticket, passenger);
        Boolean paxIsOnManifest = passengerTicketMatchesManifestItem(ticket, flightManifest);

        if (match && paxIsOnManifest) {
            if (flight.getID().equals(ticket.getTicketFlightID())){
                flight.addPassengerToFlight(ticket);
            }
        }
        return;
    }

    public Flight findMatchingFlightByID(String flightID) {
        Flight result = null;
        for (Flight flight : this.flights) {
            if (flight.getID().equals(flightID)) {
                result = flight;
            }
        }
        return result;
    }
     public Boolean passengerNameMatchesTicket(Ticket ticket, Passenger passenger){
        if (ticket.getName().equals(passenger.getName())){
            return true;
        }
        return false;
     }

     public Boolean passengerTicketMatchesManifestItem(Ticket ticket, ArrayList<Ticket> flightManifest) {
         for (Ticket manifestTicket : flightManifest) {
             if (manifestTicket.equals(ticket)) {
                 return true;
             }
         }
         return false;
     }
}
