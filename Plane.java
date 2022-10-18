public class Plane extends AirTransportation{
    private int numEngine;
    private int wingspan;



    public Plane(int speed, double cost, String purchaseType, int numPassengers, String engineType, int numEngine, int wingspan){
        super(speed, cost, purchaseType, numPassengers, engineType);
        this.numEngine = numEngine;
        this.wingspan = wingspan;
    }

    public int getNumEngine() { return numEngine; }

    public int getWingspan() { return wingspan; }

    public void setNumEngine(int numEngine) { this.numEngine = numEngine; }

    public void setWingspan(int wingspan) { this.wingspan = wingspan;}
    
    public double totalCost(){
        int numPassengers = getNumPassengers();
        double costPerTicket = getCost();

        double finalTotalCost = numPassengers * costPerTicket;

        return finalTotalCost;
    }

    public String location(){
        String planeLocation = "Go to ILM Airport at 9:30am";
        return planeLocation;
    }

    @Override
    public String toString(){
        return String.format("%sNumber of Engines:%-12dWingspan:%-10d%n",super.toString(), numEngine, wingspan);
    }
}
