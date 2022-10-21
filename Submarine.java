public class Submarine extends Transportation{
    private String powerSource;
    private int windows;


    public Submarine(String purchaseType, int speed, int numPassengers, double cost, String powerSource, int windows) {
        super(purchaseType, speed, numPassengers, cost);
        this.powerSource = powerSource;
        this.windows = windows;
    }

    public String getPowerSource() {
        return powerSource;
    }
    public int getWindows() {
        return windows;
    }
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();
        if (getPurchaseType().equals("Rent")){
            return costPerTicket;
        } else {
            double finalTotalCost = numPassengers * costPerTicket;
            return finalTotalCost;
        }
    }

    public String location(){
        String subLocation = "Go to Port Fisher at 10:30am.";
        return subLocation;
    }

    @Override
    public String toString(){
        return String.format("%sPower Source: %-10s%nWindows: %-10s%n",super.toString(),powerSource,windows);
    }
}
