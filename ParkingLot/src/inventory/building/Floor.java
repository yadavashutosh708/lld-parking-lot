package inventory.building;

import exception.SlotNotFoundException;
import inventory.vehicle.IVehicle;

import java.util.HashMap;
import java.util.Map;

public class Floor implements IFloor{
    private Map<IParkingSpot, IVehicle> busyParkingSlots;
    private Map<Long, IParkingSpot> vacantParkingSlots;

    public Floor(int initialCapacity){
        vacantParkingSlots = new HashMap<>();
        busyParkingSlots = new HashMap<>();
        IParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();
        for(int i = 0; i <= initialCapacity; i++){
            vacantParkingSlots.put((long)i,
                    parkingSpotFactory.createParkingSpot());
        }
    }

    @Override
    public long parkVehicle(IVehicle vehicle){
        IParkingSpot parkingSpot = getNearestParkingSlot();
        long parkingSpotId = parkingSpot.getId();
        parkingSpot.assignVehicle(vehicle);
        busyParkingSlots.put(vacantParkingSlots.remove(parkingSpotId), vehicle);
        return parkingSpotId;
    }

    @Override
    public void unParkVehicle(long id) throws SlotNotFoundException {
        long parkingId = -1;
        IParkingSpot parkingSpot = null;
        for(Map.Entry<IParkingSpot, IVehicle> map: busyParkingSlots.entrySet()){
            if(map.getKey().getId() == id) {
                parkingSpot = map.getKey();
            }
        }

        if(parkingSpot == null){
            throw new SlotNotFoundException();
        }


        parkingId = parkingSpot.getId();
        parkingSpot.unassignVehicle();

        busyParkingSlots.remove(parkingId);
        vacantParkingSlots.put((long) parkingId, new ParkingSpot(parkingId));
    }

    @Override
    public IParkingSpot getNearestParkingSlot() {
        long id = (long)Math.random()*10;
        System.out.println(id);
        IParkingSpot parkingSpot = vacantParkingSlots.get(id);
        return parkingSpot;
    }

    @Override
    public int getRemainingCapacity() {
        return vacantParkingSlots.size();
    }
}
