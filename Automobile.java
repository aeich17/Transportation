/**
 * PROGRAM PURPOSE: Serves as a automibile that is available to be rented for a set price 
 * Name: Joey Maveus
 * Date: 10/18/2022
 * Section: CSC 331-001
*/
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
        String carLocation = "Go to the nearest Hertz car rental to get your car for the day.";
        return carLocation;
    }
//there is not cost calculations required because there is a flat rate to rent a car
    @Override
    public String toString(){
        return String.format("%sMake:%-13sModel:%-10s%n",super.toString(),make,model);
    }
}
