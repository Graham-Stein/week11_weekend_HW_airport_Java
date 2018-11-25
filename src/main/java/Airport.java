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
//        for each flight in flights
//        if the flight ID matches the flight in flights
        Flight flight = findMatchingFlightByID(flightID);
//        check to see if the ticket name and passenger name match
        Boolean match = passengerNameMatchesTicket(ticket, passenger);

        if (match) {
            if (flight.getID().equals(ticket.getTicketFlightID())){
                flight.addTicketToManifest(ticket);
            }
        }
        return;
//        then check to see if the ticket is on the manifest
//        if tickets match, add the ticket to the paxOnFlight list
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



//    CHECK TICKET - Take ticket and check if flight has that ticket on the manifest return boolean.
}
