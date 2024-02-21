import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Engine {
    private FuelType fuelType;
    private static double maxfuel = 200.0;
    private double currentfuel;
    
    public Engine(FuelType fuelType, double currentfuel) {
        this.fuelType = fuelType;
        this.currentfuel = currentfuel;
    }

    public FuelType getfuelType() {
        return this.fuelType;
    }

    public double getmaxfuel() {
        return maxfuel;
    }

    public double getcurrentfuel() {
        return this.currentfuel;
    }

    public void refuel(double maxfuel) {
        this.currentfuel = maxfuel;
    }

    public boolean go() {
        this.currentfuel--;
        System.out.println("Remaining Fuel:" + this.currentfuel);
        return this.currentfuel > 0; 
    }
    }
