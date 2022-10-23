/**
 * Adam Eichman
 * 10/21/2022
 * CSC 331-001
 * Dirigible
 * Subclass of AirTransportation which gives further details on a certain dirigible
 */

public class Dirigible extends AirTransportation  {
    private int volume;
    private int length;

    public Dirigible(int speed, double cost, String purchaseType, int numPassengers, String engineType, int volume, int length) {
        super(speed, cost, purchaseType, numPassengers, engineType);
        this.volume = volume;
        this.length = length;
    }

    public int getVolume() { return volume; }

    public int getLength() { return length; }

    public void setVolume(int volume) { this.volume = volume; }

    public void setLength(int length) { this.length = length; }
    
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }

    public String location(){
        String dirigibleLocation = "Go to ILM Airport at 8:00am";
        return dirigibleLocation;
    }

    @Override
    public String toString(){
        return String.format("%sVolume:%-12dLength:%-10d%n",super.toString(), volume, length);
    }
}
