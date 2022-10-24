/**
 * Adam Eichman
 * 10/21/2022
 * CSC 331-001
 * AirTransportation
 * Class that is to be used as a super class to get more specific forms of air transportation
 */

public class AirTransportation extends Transportation {
    private String engineType;
    public AirTransportation(int speed, double cost, String purchaseType, int numPassengers, String engineType) {
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
        return String.format("%sEngine Type:%-10s",super.toString(), engineType);
    }
}
