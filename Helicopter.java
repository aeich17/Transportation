public class Helicopter extends AirTransportation {
    private int numRotors;
    private int length;



    public Helicopter(int speed, double cost, String purchaseType, String numPassengers, int numRotors, int length){
        super(speed, cost, purchaseType, numPassengers);
        this.numRotors = numRotors;
        this.length = length;
    }

    public int getNumRotors() { return numRotors; }

    public int getLength() { return length; }

    public void setNumRotors(int numRotors) { this.numRotors = numRotors; }

    public void setLength(int length) { this.length = length; }
}
