public class Submarine extends Transportation{
    private String powerSource;
    private int windows;


    public Submarine(String purchaseType, int speed, int numPassengers, double cost, String powerSource, int windows) {
        super(purchaseType, speed, numPassengers, cost);
        this.powerSource = powerSource;
        this.windows = windows;
    }

    public String getPowerSource() {
        return powerSource;
    }
    public int getWindows() {
        return windows;
    }
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }
}
