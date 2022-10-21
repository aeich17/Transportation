/**
 * PROGRAM PURPOSE: Severs as a super class to the more specific modes of land transportation.
 * Name: Joey Maveus
 * Date: 10/18/2022
 * Section: CSC 331-001
*/
public class LandTransportation extends Transportation{
    private int numWheels;
    private String powerSource;

    public LandTransportation(int speed, double cost, String purchaseType, int numPassengers, int numWheels, String powerSource) {
        super(speed, cost, purchaseType, numPassengers);//supering in the basic info from the transportation class.
        this.numWheels = numWheels;
        this.powerSource = powerSource;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    @Override
    public String toString(){// this is a toString method that attatches to the to string method from Transportation.
        return String.format("%sNumber of wheels:%-10dPower Type:%-10s",super.toString(),numWheels,powerSource);
    }
}
