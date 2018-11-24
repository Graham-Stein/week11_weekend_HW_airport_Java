import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Ticket> ticketListForFlight;
    private Hangar hangar;
    private Flight flight;

    public Airline (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


//    Add aircraft to hangar
//
    public void addAircraftToHangar(Aircraft aircraft, Hangar hangar){
        this.hangar = hangar;
        hangar.addAircraft(aircraft);
    }

//    assign aircraft to flight

//    public void addAircraftToFlight(){
//        call method in hangar/airport to move aircraft to flight

    public void sellTicket(String destination, Passenger passenger, Flight flight){
        Ticket ticket = new Ticket(destination, passenger);
        flight.addTicketToManifest(ticket);
    }


}
//

    // AIRLINE SELLS TICKET,
//     GENERATES CONTENTS OF TICKET THEN
// ADDS TO THE MANIFEST ON THE FLIGHT AND
    // PROVIDES THE TICKET TO THE PASSENGER???

//    public String getManifest(){
//        for (String ticketlist.)
//    }

