public class Automobile extends LandTransportation {
    private String make;
    private String model;

    public Automobile(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource, String make, String model) {
        super(speed, cost, purchaseType, numPassengers, numWheels, powerSource);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String location(){
        String carLocation = "Go to the Hertz car rental to get your car for the day.";
        return carLocation;
    }

    @Override
    public String toString(){
        return String.format("%sMake:%-13sModel:%-10s%n",super.toString(),make,model);
    }
}
