package inventory.vehicle;

import inventory.building.IParkingSpot;

public interface IVehicle {
    public int getId();
    public IRegistrationDetails getRegistrationNumber();
    public INumberPlate getNumberPlate();
    public FuelType getVehicleType();
    public VehicleType getNumberOfWheels();
    public IParkingSpot getParkedLocation();
    public String getVehicleColor();
}
