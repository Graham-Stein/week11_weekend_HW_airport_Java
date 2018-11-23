public class Aircraft {

    private AircraftType aircraftType;

    public Aircraft(AircraftType aircraftType){
        this.aircraftType = aircraftType;
    }

    public AircraftType getAircraftType() {
        return this.aircraftType;
    }

    public int getMaxSeatCapacity(){
        return this.aircraftType.getMaxPassengers();
    }
}
