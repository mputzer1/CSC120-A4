import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Engine {
    private FuelType fuelType;
    private double maxfuel;
    private double currentfuel;
    //Should I start currentfuel at 0 and increment? then user inputs maxfuel?

    public Engine(FuelType fuelType, double currentfuel, double maxfuel) {
        this.fuelType = fuelType;
        this.currentfuel = currentfuel;
        this.maxfuel = maxfuel;
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
