import java.util.ArrayList;

/**
 * Train class which contains the number of cars, the engine, an arraylist of cars, the fuel type, the fuel capacity, and the passenger capacity
 */
public class Train {
    private int ncars;
    private Engine engine;
    private ArrayList<Car> cars;
    private FuelType fuelType;
    private double fuelcapacity;
    private int passengercapacity;

    public Train(FuelType fuelType, double fuelcapacity, int ncars, int passengercapacity) {
        this.fuelType = fuelType;
        this.passengercapacity = passengercapacity;
        this.fuelcapacity = fuelcapacity;
        this.ncars = ncars;
        this.cars = new ArrayList<Car>();

    }

    /**
     * Getter for the engine class
     * @return this.engine
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Intended to return the ith car.
     * @return ith car.
     */
    //public Car getCar(int i) {
        //String icar = this.cars.get(i);
    //}

    /**
     * Gets the max capacity across all cars for passengers
     * @return the max capacity across all cars for passengers
     */
    public int getMaxCapacity() {
        return this.passengercapacity * this.ncars;
    }

    /**
     * Intended to return the number of seats remaining across all cars
     */
    //public int seatsRemaining() {
        //Car.seatsRemaining();
    //}

    /**
     * Prints all passengers oboard if the train has passengers. If not, it prints that the train is empty.
     */
    //public void printManifest() {
        //if (passengers.size() > 0) {
            //for(int i=0; i < passengers.size(); i++) {
                //System.out.println(passengers.get(i));
            //}
        //}
        //else {
            //System.out.println("This train is empty");
       // }
   // }


    /**
     * This is a general main to test all the classes of the train. The engine class functions appropriately, but the other classes are still being built.
     * @param args
     */
    public static void main(String[] args) {
        Passenger John = new Passenger("John");
        Car Car1 = new Car(60);
        John.boardCar(Car1);
        Car1.printManifest();
        System.out.println("Seats Remaining:" + Car1.seatsRemaining());
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.0); {
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
            System.out.println("Out of fuel.");
            myEngine.refuel();
        
    }
    }
}


 
    
