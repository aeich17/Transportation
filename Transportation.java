public class Transportation {
    private String purchaseType;
    private int speed;
    private int numPassengers;
    private double cost;

    public Transportation(String purchaseType, int speed, int numPassengers, double cost) {
        this.purchaseType = purchaseType;
        this.speed = speed;
        this.numPassengers = numPassengers;
        this.cost = cost;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public int getSpeed() {
        return speed;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public double getCost() {
        return cost;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString(){
        return String.format("Average Speed:%-10dCost:$%-10.2fPurchase Type:%-10sPassengers:%-10d",speed,cost,purchaseType,numPassengers);
}
