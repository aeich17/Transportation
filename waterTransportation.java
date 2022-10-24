public class waterTransportation extends Transportation{

    waterTransportation(String purchaseType, int speed, int numPassengers, double cost){
        super(speed, cost, purchaseType, numPassengers);
    }

    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }
}
