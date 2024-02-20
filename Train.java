import java.util.ArrayList;

public class Train {
    private FuelType fuelType;
    private double maxfuel;
    private int ncars;
    private int capacity;
    private Engine engine;
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Train(Engine engine, FuelType fuelType, double maxfuel, int ncars, int capacity) {
        this.fuelType = fuelType;
        this.engine = engine;
        maxfuel = 200.0;
        ncars = 20;
        capacity = 500; 
    }

    public Engine getEngine() {
        return this.engine;
    }
}