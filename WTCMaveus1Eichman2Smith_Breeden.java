import java.util.Scanner;
public class WTCMaveus1Eichman2Smith_Breeden {
    public static void main(String[]args){
        Bus bus = new Bus(45,35.00,"Ticket", 50, 6, "Gas", 10,"Blue");
        Automobile car = new Automobile(60,150.50,"Rent",5,4,"Electric","Tesla","Model S");
        Bike bike = new Bike(25,30.00,"Rent", 1, 2, "Human", 4,"Street");
        Train train = new Train(55, 12.50, "Ticket",500,8+(4*5),"Diesel",5,"Automated Train");

        Plane plane = new Plane( 515,300.00,"Ticket",140, "jet", 2, 225);
        Dirigible dirigible = new Dirigible(40,100.00,"Ticket",  30,  "propeller", 132000, 192);
        Helicopter helicopter = new Helicopter(130,200.00,"Ticket",  6,  "Turbine", 1, 30);
        HotAirBalloon hotAirBalloon = new HotAirBalloon(10,40,"Ticket",  4,  "Burner", "Checkered", 2);

        Boat boat = new Boat(60,"Rent",  10, 400.00, "Outboard engine", "White");
        Ship ship = new Ship(25,150,"Ticket",  900,  "Cruise", 1500);
        Submarine submarine = new Submarine("Ticket", 40, 75, 175.00, "Nuclear power", 5);
        
        Scanner input = new Scanner(System.in);

        System.out.printf("By which means would you like to travel?%n1.Air%n2.Water%n3.Land%n");
        System.out.print("Enter: ");
        int transportationType = input.nextInt();

        if(transportationType == 1){
            System.out.printf("%s%n","Air Travel Types");

            System.out.printf("%-20s","1. Plane");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",plane.getSpeed(),plane.getCost(),plane.getPurchaseType(),plane.getNumPassengers());

            System.out.printf("%-20s","2. Dirigible");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",dirigible.getSpeed(),dirigible.getCost(),dirigible.getPurchaseType(),dirigible.getNumPassengers());

            System.out.printf("%-20s","3. Helicopter");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",helicopter.getSpeed(),helicopter.getCost(),helicopter.getPurchaseType(),helicopter.getNumPassengers());

            System.out.printf("%-20s","4. Hot Air Balloon");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",hotAirBalloon.getSpeed(),hotAirBalloon.getCost(),hotAirBalloon.getPurchaseType(),hotAirBalloon.getNumPassengers());

            System.out.println("Which mode of transportation would you like to use? 1-4");
            System.out.print("Enter: ");
            int transChoice = input.nextInt();

            String choice = "N";

            while(choice != "Y"||choice !="y") {
                if (transChoice == 1) {
                    System.out.printf("%-10s", "Plane");
                    System.out.print(plane);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if (choice.equals("y") || choice.equals("Y")) {
                        break;
                    }
                    else {
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice ==2){
                    System.out.printf("%-10s","Dirigible");
                    System.out.print(dirigible);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                } else if(transChoice ==3){
                    System.out.printf("%-10s","Helicopter");
                    System.out.print(helicopter);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                } else if(transChoice ==4){
                    System.out.printf("%-10s","Hot Air Balloon");
                    System.out.print(hotAirBalloon);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
            }

            if(transChoice == 1){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                bus.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",plane.totalCost());
                System.out.println(plane.location());
            }
            else if(transChoice == 2){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                train.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",dirigible.totalCost());
                System.out.println(dirigible.location());
            }
            else if(transChoice == 3){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                train.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",helicopter.totalCost());
                System.out.println(helicopter.location());
            }
            else{
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                hotAirBalloon.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",hotAirBalloon.totalCost());
                System.out.println(hotAirBalloon.location());
            }

        }

        else if (transportationType ==2) {
            System.out.printf("%s%n","Water Travel Types");
            System.out.printf("%-15s","1. Boat");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",boat.getSpeed(),boat.getCost(),boat.getPurchaseType(),boat.getNumPassengers());

            System.out.printf("%-15s","2. Ship");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",ship.getSpeed(),ship.getCost(),ship.getPurchaseType(),ship.getNumPassengers());

            System.out.printf("%-15s","3. Submarine");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",submarine.getSpeed(),submarine.getCost(),submarine.getPurchaseType(),submarine.getNumPassengers());

            System.out.println("Which mode of transportation would you like to use? 1-3");
            System.out.print("Enter: ");
            int transChoice = input.nextInt();

            String choice = "N";

            while(choice != "Y"||choice !="y"){
                if(transChoice ==1){
                    System.out.printf("%-10s","Boat");
                    System.out.print(boat);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-3");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice ==2){
                    System.out.printf("%-10s","Ship");
                    System.out.print(ship);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice ==3){
                    System.out.printf("%-10s","Submarine");
                    System.out.print(submarine);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
            }
            if(transChoice == 1){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                boat.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",boat.totalCost());
                System.out.println(boat.location());
            }
            else if(transChoice == 2){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                ship.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",ship.totalCost());
                System.out.println(ship.location());
            }
            else {
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                submarine.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",submarine.totalCost());
                System.out.println(submarine.location());
            }
        }

        else{
            System.out.printf("%s%n","Land Travel Types");

            System.out.printf("%-15s","1. Bus");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",bus.getSpeed(),bus.getCost(),bus.getPurchaseType(),bus.getNumPassengers());

            System.out.printf("%-15s","2. Automobile");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",car.getSpeed(),car.getCost(),car.getPurchaseType(),car.getNumPassengers());

            System.out.printf("%-15s","3. Bike");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",bike.getSpeed(),bike.getCost(),bike.getPurchaseType(),bike.getNumPassengers());

            System.out.printf("%-15s","4. Train");
            System.out.printf("Average Speed(mph):%-20d$%-20.2fPurchase Type:%-20sPassengers:%-20d%n",train.getSpeed(),train.getCost(),train.getPurchaseType(),train.getNumPassengers());

            System.out.println("Which mode of transportation would you like to use? 1-4");
            int transChoice = input.nextInt();

            String choice = "N";

            while(choice != "Y"||choice !="y"){
                if(transChoice ==1){
                    System.out.printf("%-10s","Bus");
                    System.out.print(bus);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice ==2){
                    System.out.printf("%-10s","Automobile");
                    System.out.print(car);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice ==3){
                    System.out.printf("%-10s","Bike");
                    System.out.print(bike);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
                else if(transChoice == 4){
                    System.out.printf("%-10s","Train");
                    System.out.print(train);
                    System.out.println("Is this the transportation that you want? Y or N");
                    System.out.print("Enter: ");
                    choice = input.next();
                    if(choice.equals("y")||choice.equals("Y")){
                        break;
                    }
                    else{
                        System.out.println("Which mode of transportation would you like to use? 1-4");
                        System.out.print("Enter: ");
                        transChoice = input.nextInt();
                    }
                }
            }
            if(transChoice == 1){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                bus.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",bus.totalCost());
                System.out.println(bus.location());
            }
            else if(transChoice == 4){
                System.out.print("How many passengers are going to be: ");
                int ticketsNeeded = input.nextInt();
                System.out.println("");
                train.setNumPassengers(ticketsNeeded);
                System.out.printf("The total cost is $%.2f%n",train.totalCost());
                System.out.println(train.location());
            }
            else if(transChoice == 2){
                System.out.println("");
                System.out.printf("The total cost is $%.2f%n",car.getCost());
                System.out.println(car.location());
            }
            else{
                System.out.println("");
                System.out.printf("The total cost is $%.2f%n",bike.getCost());
                System.out.println(bike.location());
            }
        }
        
    }
}
