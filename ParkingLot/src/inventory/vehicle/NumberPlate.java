package inventory.vehicle;

public class NumberPlate implements INumberPlate{
    private String numberPlate;
    private String color;

    public NumberPlate(String numberPlate, String color) {
        this.numberPlate = numberPlate;
        this.color = color;
    }

    @Override
    public String getNumberPlate() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
