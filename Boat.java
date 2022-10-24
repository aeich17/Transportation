public class Boat extends Transportation{
    private String engineType;
    private String color;

    public Boat(int speed,String purchaseType, int numPassengers, double cost, String engineType, String color) {
        super(speed, cost, purchaseType, numPassengers);
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
        String boatLocation = "Go to the Nauti Times shop at 2:30pm.";
        return boatLocation;
    }

    @Override
    public String toString(){
        return String.format("%sEngine type: %-10s%nColor: %-10s%n",super.toString(),engineType,color);
    }
}
