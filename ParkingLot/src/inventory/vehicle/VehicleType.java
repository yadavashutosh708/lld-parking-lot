package inventory.vehicle;

public enum VehicleType {
    BIKE(2),
    BICYCLE(2),
    CAR(4),
    UNDEFINED(0);
    private int value;

    private VehicleType(final int value) {
        this.value = value;
    }

    public static VehicleType valueOf(final int type) {
        for (final VehicleType v : values()) {
            if (v.getValue() == type) {
                return v;
            }
        }
        return UNDEFINED;
    }

    public int getValue() {
        return value;
    }
}
