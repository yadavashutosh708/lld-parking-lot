package inventory.vehicle;

public interface IVehicleAbstractFactory {
    public IVehicle createElectricVehicle(VehicleType type, INumberPlate numberPlate);
    public IVehicle createNonElectricVehicle(VehicleType type, INumberPlate numberPlate);
}
