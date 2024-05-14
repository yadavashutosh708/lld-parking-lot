package inventory.vehicle;

public class VehicleAbsractFactory implements IVehicleAbstractFactory{
    @Override
    public IVehicle createElectricVehicle(VehicleType type, INumberPlate numberPlate) {
        IVehicle vehicle = null;
        IVehicleFactory vehicleFactory = new VehicleFactory();
        switch (type){
            case CAR -> {
                return vehicleFactory.createCar(numberPlate);
            }
        }
        return vehicle;
    }

    @Override
    public IVehicle createNonElectricVehicle(VehicleType type, INumberPlate numberPlate) {
        IVehicle vehicle = null;
        IVehicleFactory vehicleFactory = new VehicleFactory();
        switch (type){
            case CAR -> {
                return vehicleFactory.createCar(numberPlate);
            }
        }
        return vehicle;
    }
}
