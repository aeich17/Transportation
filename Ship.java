public class Ship extends Transportation{
    private String purpose;
    private double maxCargo;

    public Ship( int speed, double cost, String purchaseType, int numPassengers,  String purpose, double maxCargo) {
        super(speed, cost, purchaseType, numPassengers);
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
        String shipLocation = "Go to Port Wilmington at 12:00pm.";
        return shipLocation;
    }

    @Override
    public String toString(){
        return String.format("%sPurpose: %-10s%nMax Cargo: %-10s%n",super.toString(),purpose,maxCargo);
    }
}
