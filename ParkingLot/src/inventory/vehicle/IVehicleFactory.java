package inventory.vehicle;

public interface IVehicleFactory {
    public IVehicle createCar(INumberPlate numberPlate);
    public IVehicle createBus(INumberPlate numberPlate);
    public IVehicle createBike(INumberPlate numberPlate);
    public IVehicle createBicycle(INumberPlate numberPlate);
    public IVehicle createAeroplane(INumberPlate numberPlate);
    public IVehicle createTruck(INumberPlate numberPlate);
}
