public class Plane extends AirTransportation{
    private int numEngine;
    private int wingspan;



    public Plane(int speed, double cost, String purchaseType, String numPassengers, String engineType, int numEngine, int wingspan){
        super(speed, cost, purchaseType, numPassengers, engineType);
        this.numEngine = numEngine;
        this.wingspan = wingspan;
    }

    public int getNumEngine() { return numEngine; }

    public int getWingspan() { return wingspan; }

    public void setNumEngine(int numEngine) { this.numEngine = numEngine; }

    public void setWingspan(int wingspan) { this.wingspan = wingspan;}

    @Override
    public String toString(){
        return String.format("%sNumber of Engines:%-12dWingspan:%-10d%n",super.toString(), numEngine, wingspan);
    }
}
