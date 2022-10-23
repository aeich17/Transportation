/**
 * Adam Eichman
 * 10/21/2022
 * CSC 331-001
 * HotAirBalloon
 * Subclass of AirTransportation which gives further details on a certain Hot Air Balloon
 */

public class HotAirBalloon extends AirTransportation {
    private String pattern;
    private int numBurners;


    public HotAirBalloon(int speed, double cost, String purchaseType, int numPassengers, String engineType, String pattern, int numBurners){
        super(speed, cost, purchaseType, numPassengers, engineType);
        this.pattern = pattern;
        this.numBurners = numBurners;
    }

    public String pattern(){ return this.pattern; }

    public int getNumBurners(){ return this.numBurners; }

    public void setPattern(String pattern) {this.pattern = pattern; }

    public void setNumBurners(int numBurners) { this.numBurners = numBurners; }
    
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }
    
    public String location(){
        String balloonLocation = "Go to Ogden Park at 9:30am";
        return balloonLocation;
    }
    
    @Override
    public String toString(){
        return String.format("%sPattern:%-12sNumber of Burners:%-10s%n",super.toString(), pattern, numBurners);
    }
}
