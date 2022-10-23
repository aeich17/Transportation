/**
 * Adam Eichman
 * 10/21/2022
 * CSC 331-001
 * Helicopter
 * Subclass of AirTransportation which gives further details on a certain Helicopter
 */

public class Helicopter extends AirTransportation {
    private int numRotors;
    private int length;



    public Helicopter(int speed, double cost, String purchaseType, int numPassengers, String engineType, int numRotors, int length){
        super(speed, cost, purchaseType, numPassengers, engineType);
        this.numRotors = numRotors;
        this.length = length;
    }

    public int getNumRotors() { return numRotors; }

    public int getLength() { return length; }

    public void setNumRotors(int numRotors) { this.numRotors = numRotors; }

    public void setLength(int length) { this.length = length; }
    
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }

    public String location(){
        String heliLocation = "Go to ILM Airport at 5:00pm";
        return heliLocation;
    }

    @Override
    public String toString(){
        return String.format("%sNumber of Rotors:%-12dLength:%-10d%n",super.toString(),numRotors, length);
    }
}
