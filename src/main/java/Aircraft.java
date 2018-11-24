public class Aircraft {

    private AircraftType aircraftType;
    private String registration;

    public Aircraft(String registration, AircraftType aircraftType){
        this.registration = registration;
        this.aircraftType = aircraftType;
    }

    public AircraftType getAircraftType() {
        return this.aircraftType;
    }

    public String getRegistration(){
        return this.registration;
    }

    public int getMaxSeatCapacity(){
        return this.aircraftType.getMaxPassengers();
    }
}
