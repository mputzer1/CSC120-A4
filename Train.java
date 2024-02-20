import java.util.ArrayList;

public class Train {
    private FuelType fuelType;
    private double maxfuel;
    private int ncars;
    private int capacity;
    private ArrayList<String> cars = new ArrayList<String>();

    public Train(FuelType fuelType, double maxfuel, int ncars, int capacity) {
        this.fuelType = fuelType;
        maxfuel = 200.0;
        ncars = 20;
        capacity = 500;
        
}
}