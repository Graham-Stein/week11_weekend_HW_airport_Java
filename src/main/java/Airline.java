import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Ticket> ticketListForFlight;
    private Hangar hangar;
    private Flight flight;
    private Airport airport;

    public Airline (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addAircraftToHangar(Aircraft aircraft, Hangar hangar){
        this.hangar = hangar;
        hangar.addAircraft(aircraft);
    }

//    assign aircraft to flight
    public void assignNewFlight(String ID, String destination, Aircraft aircraft, Airport airport){
        this.flight = new Flight(ID, destination, aircraft);
        airport.addFlight(this.flight);
    }

//    public void addAircraftToFlight(){
//        call method in hangar/airport to move aircraft to flight

    public Ticket sellTicket(String destination, Passenger passenger, Flight flight){
        Ticket ticket = new Ticket(destination, passenger);
        flight.addTicketToManifest(ticket);
        return ticket;
    }


}

