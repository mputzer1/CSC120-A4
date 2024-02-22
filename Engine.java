import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

/**
 * The engine class which stores fuel type, max fuel, and current fuel in the engine.
 */
public class Engine {
    private FuelType fuelType;
    private double maxfuel;
    private double currentfuel;
    
    public Engine(FuelType fuelType, double currentfuel, double maxfuel) {
        this.fuelType = fuelType;
        this.currentfuel = currentfuel;
        this.maxfuel = maxfuel;
    }

    /**
     * Getter for fuel type
     * @return this.fuelType
     */
    public FuelType getfuelType() {
        return this.fuelType;
    }

    /**
     * Getter for max fuel that the engine can hold
     * @return this.maxfuel
     */
    public double getmaxfuel() {
        return this.maxfuel;
    }

    /**
     * Getter for the current fuel amount in the engine
     * @return this.currentfuel
     */
    public double getcurrentfuel() {
        return this.currentfuel;
    }

    /**
     * The refuel method resets the current fuel to the max fuel that the engine can hold.
     */
    public void refuel() {
        this.currentfuel = this.maxfuel;
    }

    /**
     * The go method takes away fuel and prints the remaining fuel until there is no fuel left.
     * @return this.currentfuel > 0 (Boolean)
     */
    public boolean go() {
        this.currentfuel--;
        System.out.println("Remaining Fuel:" + this.currentfuel);
        return this.currentfuel > 0; 
    }
    }
