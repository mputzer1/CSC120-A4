import java.util.ArrayList;

public class Train {
    private int ncars;
    private Engine engine;
    private ArrayList<Car> cars = new ArrayList<Car>();
    private FuelType fuelType;
    private double maxfuel;
    private int capacity;

    public Train(Engine engine, FuelType fuelType, double maxfuel, int ncars, ArrayList<Car> cars, int capacity) {
        this.fuelType = fuelType;
        this.engine = engine;
        this.capacity = capacity;
        this.maxfuel = maxfuel;
        this.ncars = ncars;
        this.cars = cars;
        this.cars.ensureCapacity(this.ncars);

    }

    public Engine getEngine() {
        return this.engine;
    }

    //public Car getCar(int i) {
        //String icar = cars.get(i);
    //}

    public int getMaxCapacity() {
        return this.capacity * this.ncars;
    }

    //public int seatsRemaining() {
        //Car.seatsRemaining();
    //}

    public static void main(String[] args) {
        Passenger John = new Passenger("John");
        Car Car1 = new Car(John,60);
        John.boardCar(Car1);
        Car1.printManifest();
        System.out.println("Seats Remaining:" + Car1.seatsRemaining());
    }

        //Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0, 200.0);
        //while (myEngine.go()) {
            //System.out.println("Choo choo!");
        //}
            //System.out.println("Out of fuel.");
        //}  
 }
    
