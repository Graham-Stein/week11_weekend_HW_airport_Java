import java.util.ArrayList;

public class Hangar {

    private int aircraftParkingCapacity;
    private String hangarName;
    private ArrayList<Aircraft> hangarInventory;

    public Hangar(String hangarName, int aircraftParkingCapacity){
        this.hangarName = hangarName;
        this.aircraftParkingCapacity = aircraftParkingCapacity;
        this.hangarInventory = new ArrayList<>();
    }

    public int getAircraftParkingCapacity(){
        return this.aircraftParkingCapacity;
    }

    public String getHangarName(){
        return this.hangarName;
    }

    public void addAircraft(Aircraft aircraft){
        this.hangarInventory.add(aircraft);
    }

    public int getNumberOfRemainingSpaces(){
        int spacesUsed = this.hangarInventory.size();
        return this.aircraftParkingCapacity - spacesUsed;
    }
}
