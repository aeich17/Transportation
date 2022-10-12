public class Ship extends Transportation{
    private String purpose;
    private double maxCargo;

    public Ship(String purchaseType, int speed, int numPassengers, double cost, String purpose, double maxCargo) {
        super(purchaseType, speed, numPassengers, cost);
        this.purpose = purpose;
        this.maxCargo = maxCargo;
    }

    public String getPurpose() {
        return purpose;
    }
    public double getMaxCargo() {
        return maxCargo;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public void setMaxCargo(double maxCargo) {
        this.maxCargo = maxCargo;
    }
}
