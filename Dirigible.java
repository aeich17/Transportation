public class Dirigible extends AirTransportation  {
    private int volume;
    private int length;

    public Dirigible(int speed, double cost, String purchaseType, String numPassengers, int volume, int length) {
        super(speed, cost, purchaseType, numPassengers);
        this.volume = volume;
        this.length = length;
    }

    public int getVolume() { return volume; }

    public int getLength() { return length; }

    public void setVolume(int volume) { this.volume = volume; }

    public void setLength(int length) { this.length = length; }
}
