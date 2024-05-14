package inventory.building;

import java.util.List;

public interface IParkingLot {
    public String getBuildingId();
    public int getNumberOfFloors();
    public String getEntrance();
    public String getExit();
    public List<List<Boolean>> getParkingSlots();
}
