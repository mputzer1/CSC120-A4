import java.util.ArrayList;

public class Train {
    private int ncars;
    private Engine engine;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Train(int capacity, Engine engine, FuelType fuelType, double maxfuel, int ncars, ArrayList<Car> cars) {
        this.engine = new Engine (fuelType, maxfuel);
        capacity = Car.getCapacity();
        this.ncars = ncars;
        this.cars = cars;
        this.cars.ensureCapacity(this.ncars);
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        int icar = cars.get(i);

    }
}