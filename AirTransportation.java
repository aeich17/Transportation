public class AirTransportation extends Transportation {
    private String engineType;
    public AirTransportation(String purchaseType, int speed, int numPassengers, double cost, String engineType) {
        super(speed, cost, purchaseType, numPassengers);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return String.format("Engine Type:%-10s",super.toString(), engineType);
    }
}
