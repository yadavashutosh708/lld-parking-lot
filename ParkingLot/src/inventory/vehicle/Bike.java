package inventory.vehicle;

import inventory.building.IParkingSpot;

public class Bike implements IVehicle{
    private int wheel;
    Bike(){

    }
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public IRegistrationDetails getRegistrationNumber() {
        return null;
    }

    @Override
    public INumberPlate getNumberPlate() {
        return null;
    }

    @Override
    public FuelType getVehicleType() {
        return null;
    }

    @Override
    public VehicleType getNumberOfWheels() {
        return null;
    }

    @Override
    public IParkingSpot getParkedLocation() {
        return null;
    }

    @Override
    public String getVehicleColor() {
        return null;
    }

}
