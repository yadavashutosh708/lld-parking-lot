package inventory.building;

import exception.NoVehicleParkedException;
import inventory.vehicle.IVehicle;

import java.util.Date;

public interface IParkingSpot {
    public boolean isOccupied();
    public IVehicle getStoredVehicle();
    public void assignVehicle(IVehicle vehicle);
    public void unassignVehicle();
    public Date getAssignedDateTime() throws NoVehicleParkedException;
    public Date getUnAssignedDateTime() throws NoVehicleParkedException;

    public long getId();
}
