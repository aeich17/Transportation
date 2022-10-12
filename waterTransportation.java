public class waterTransportation extends Transportation{

    waterTransportation(String purchaseType, int speed, int numPassengers, double cost){
        super(purchaseType, speed, numPassengers, cost);
    }

    @Override
    public String toString() {
        return String.format("%s",
                super.toString());
    }

}
