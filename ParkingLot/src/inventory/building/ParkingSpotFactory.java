package inventory.building;

import utils.VehicleIdGenerator;

public class ParkingSpotFactory implements IParkingSpotFactory{
    @Override
    public IParkingSpot createParkingSpot() {
        return new ParkingSpot(VehicleIdGenerator.getInstance().generateId());
    }
}
