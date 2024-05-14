package inventory.vehicle;

public enum FuelType {
    NON_ELECTRIC(1),
    ELECTRIC(2),
    HYDROGEN(3),
    UNDEFINED(0);
    private int value;

    private FuelType(final int value) {
        this.value = value;
    }

    public static FuelType valueOf(final int type) {
        for (final FuelType v : values()) {
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
