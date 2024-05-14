package utils;

public class VehicleIdGenerator {
    private static volatile VehicleIdGenerator instance;
    private long id;

    private VehicleIdGenerator(){
        id = -1;
    };


    public static VehicleIdGenerator getInstance() {
        if (instance == null) {
            synchronized (VehicleIdGenerator.class) {
                if (instance == null) {
                    instance = new VehicleIdGenerator();
                }
            }
        }
        return instance;
    }

    public long generateId(){
        return id = id+1;
    }
}
