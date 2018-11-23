public class Aircraft {

    private AircraftType aircraft;

    public Aircraft(AircraftType aircraft){
        this.aircraft = aircraft;
    }

    public AircraftType getAircraft() {
        return this.aircraft;
    }

    public int getMaxSeatCapacity(){
        return this.aircraft.getMaxPassengers();
    }
}
