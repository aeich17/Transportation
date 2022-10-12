public class Boat extends Transportation{
    private String engineType;
    private String color;

    public Boat(String purchaseType, int speed, int numPassengers, double cost, String engineType, String color) {
        super(purchaseType, speed, numPassengers, cost);
        this.engineType = engineType;
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }
    public String getColor() {
        return color;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
