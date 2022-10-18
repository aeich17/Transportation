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

    @Override
    public String toString(){
        return String.format("%sVolume:%-12dLength:%-10d%n",super.toString(), volume, length);
    }
}
