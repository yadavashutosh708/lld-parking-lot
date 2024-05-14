package inventory.building;

import exception.NoVehicleParkedException;
import inventory.vehicle.IVehicle;
import utils.VehicleIdGenerator;

import java.util.Date;

public class ParkingSpot implements IParkingSpot {
    private long id;
    private boolean isOccupied;
    private IVehicle vehicle;
    private Date assignedTime;
    private Date unAssignedTime;
    private long parkedTime;

    ParkingSpot(long id){
        id = id;
        this.vehicle = null;
        assignedTime = null;
        unAssignedTime = null;
    }

    public long getId(){
        return id;
    }
    @Override
    public boolean isOccupied() {
        return this.isOccupied;
    }

    @Override
    public IVehicle getStoredVehicle() {
        return this.vehicle;
    }

    @Override
    public void assignVehicle(IVehicle vehicle) {
        this.isOccupied = true;
        vehicle = vehicle;
        setAssignedDateTime();
    }

    @Override
    public void unassignVehicle() {
        this.isOccupied = false;
        vehicle = null;
        setUnAssignedDateTime();
    }

    @Override
    public Date getAssignedDateTime() throws NoVehicleParkedException {
        if(assignedTime == null)
            throw new NoVehicleParkedException();

        return assignedTime;
    }

    private void setAssignedDateTime(){
        assignedTime = new Date();
    }
    @Override
    public Date getUnAssignedDateTime() throws NoVehicleParkedException {
        if(unAssignedTime == null)
            throw new NoVehicleParkedException();
        return unAssignedTime;
    }

    private void setUnAssignedDateTime(){
        unAssignedTime = new Date();
        setLastParkedTime();
        unAssignedTime = null;
        assignedTime = null;
    }

    private void setLastParkedTime(){
        parkedTime = unAssignedTime.getTime() - assignedTime.getTime();
        System.out.println(parkedTime);
    }

    private long getParkedTime(){
        return parkedTime;
    }
}
