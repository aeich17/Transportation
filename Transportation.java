public class Transportation {
    private int speed;
    private double cost;
    private String purchaseType;
    private int numPassengers;

    public Transportation(int speed, double cost, String purchaseType, int numPassengers) {
        this.speed = speed;
        this.cost = cost;
        this.purchaseType = purchaseType;
        this.numPassengers = numPassengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public String toString(){
        return String.format("Average Speed:%-10dCost:$%-10.2fPurchase Type:%-10sPassengers:%-10d",speed,cost,purchaseType,numPassengers);
    }
}
