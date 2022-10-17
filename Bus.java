public class Bus extends LandTransportation{
    private int numWindows;
    private String color;
    public Bus(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource, int numWindows, String color) {
        super(speed, cost, purchaseType, numPassengers, numWheels, powerSource);
        this.numWindows = numWindows;
        this.color = color;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }

    public String location(){
        String busLocation = "Go to the Greyhound station at 3:30pm.";
        return busLocation;
    }

    @Override
    public String toString(){
        return String.format("%sNumber of Windows:%-10dColor:%-10s%n",super.toString(),numWindows,color);
    }
}
