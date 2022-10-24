public class Bike extends LandTransportation{
    private int numGears;
    private String bikeType;

    public Bike(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource, int numGears, String bikeType) {
        super(speed, cost, purchaseType, numPassengers, numWheels, powerSource);
        this.numGears = numGears;
        this.bikeType = bikeType;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String location(){
        String bikeLocation = "Go to the Seahawk Bike stand to get your bike for the day.";
        return bikeLocation;
    }

    @Override
    public String toString(){
        return String.format("%sGears:%-12dBike Type:%-10s%n",super.toString(),numGears,bikeType);
    }
}
