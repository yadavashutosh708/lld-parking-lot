package inventory.building;

import exception.SlotNotFoundException;
import inventory.vehicle.IVehicle;

public interface IFloor {
    long parkVehicle(IVehicle vehicle);

    void unParkVehicle(long id) throws SlotNotFoundException;

    public IParkingSpot getNearestParkingSlot();
    public int getRemainingCapacity();
}
