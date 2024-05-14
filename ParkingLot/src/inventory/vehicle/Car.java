package inventory.vehicle;

import inventory.building.IParkingSpot;

public class Car extends Vehicle{

    public Car(){
        vehicleType = VehicleType.CAR;
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
        return fuelType;
    }

    @Override
    public VehicleType getNumberOfWheels() {
        return vehicleType;
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
