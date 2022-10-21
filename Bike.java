/**
 * PROGRAM PURPOSE: Represents a bike that is available to be rented.
 * Name: Joey Maveus
 * Date: 10/18/2022
 * Section: CSC 331-001
*/
public class Bike extends LandTransportation{//extends the land transportation class while adding unique elements to the class to distinguish itself.
    private int numGears;
    private String bikeType;

    public Bike(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource, int numGears, String bikeType) {
        super(speed, cost, purchaseType, numPassengers, numWheels, powerSource);
        this.numGears = numGears;
        this.bikeType = bikeType;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String location(){//Gives a specific location to pick up the bike
        String bikeLocation = "Go to the Seahawk Bike stand to get your bike for the day.";
        return bikeLocation;
    }

    @Override
    public String toString(){//supers in the toSting methods of both Transportation and LandTransportation to print all of the detailed info.
        return String.format("%sGears:%-12dBike Type:%-10s%n",super.toString(),numGears,bikeType);
    }
}
