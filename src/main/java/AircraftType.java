public enum AircraftType {
    Embraer145 (49),
    Embraer135 (37),
    Saab2000 (50);

    private final int maxPassengers;

    AircraftType (int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers(){
        return this.maxPassengers;
    }
}
