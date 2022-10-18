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

    @Override
    public String toString(){
        return String.format("%sNumber of Rotors:%-12dLength:%-10d%n",super.toString(),numRotors, length);
    }
}
