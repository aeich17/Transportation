public class LandTransportation extends Transportation{
    private int numWheels;
    private String powerSource;

    public LandTransportation(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource) {
        super(speed, cost, purchaseType, numPassengers);
        this.numWheels = numWheels;
        this.powerSource = powerSource;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    @Override
    public String toString(){
        return String.format("%sNumber of wheels:%-10dPower Type:%-10s",super.toString(),numWheels,powerSource);
    }
}
