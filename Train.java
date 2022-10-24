public class Train extends LandTransportation{
    private int numCars;
    private String trainDriver;

    public Train(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource, int numCars, String trainDriver) {
        super(speed, cost, purchaseType, numPassengers, numWheels, powerSource);
        this.numCars = numCars;
        this.trainDriver = trainDriver;
    }

    public int getNumCars() {
        return numCars;
    }

    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }

    public String getTrainDriver() {
        return trainDriver;
    }

    public void setTrainDriver(String trainDriver) {
        this.trainDriver = trainDriver;
    }

    public String location(){
        String trainLocation = "Go to the train station at 6:00am.";
        return trainLocation;
    }

    @Override
    public String toString(){
        return String.format("%sNumber of Cars:%-13dDriver Type:%-10s%n",super.toString(),numCars,trainDriver);
    }
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }
}
