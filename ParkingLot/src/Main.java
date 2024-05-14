import exception.SlotNotFoundException;
import inventory.building.Floor;
import inventory.building.IFloor;
import inventory.building.IParkingSpotFactory;
import inventory.building.ParkingSpotFactory;
import inventory.vehicle.*;

public class Main {
    public static void main(String[] args) {
        IVehicleAbstractFactory vehicleAbstractFactory = new VehicleAbsractFactory();
        IVehicle vehicle = vehicleAbstractFactory.createNonElectricVehicle(VehicleType.CAR, new NumberPlate("UP54AU8654", "Devil Black"));

        IFloor floor = new Floor(10);
        long id  = floor.parkVehicle(vehicle);
        try {
            Thread.sleep(3000);
            floor.unParkVehicle(id);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (SlotNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}