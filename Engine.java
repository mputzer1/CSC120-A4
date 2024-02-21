import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Engine {
    private FuelType fuelType;
    private double maxfuel;
    private double currentfuel;
    
    public Engine(FuelType fuelType, double currentfuel, double maxfuel) {
        this.fuelType = fuelType;
        this.currentfuel = currentfuel;
        this.maxfuel = maxfuel;
    }

    public FuelType getfuelType() {
        return this.fuelType;
    }

    public double getmaxfuel() {
        return this.maxfuel;
    }

    public double getcurrentfuel() {
        return this.currentfuel;
    }

    public void refuel() {
        this.currentfuel = this.maxfuel;
    }

    public boolean go() {
        this.currentfuel--;
        System.out.println("Remaining Fuel:" + this.currentfuel);
        return this.currentfuel > 0; 
    }
    }
