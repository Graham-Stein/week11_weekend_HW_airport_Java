public class Hangar {

    private int aircraftParkingSpaces;
    private String hangarName;

    public Hangar(String hangarName, int aircraftParkingSpaces){
        this.hangarName = hangarName;
        this.aircraftParkingSpaces = aircraftParkingSpaces;
    }

    public int getAircraftParkingSpaces(){
        return this.aircraftParkingSpaces;
    }

    public String getHangarName(){
        return this.hangarName;
    }
}
