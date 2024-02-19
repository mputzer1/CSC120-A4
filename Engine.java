import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Engine {
    //private FuelType f = FuelType.ELECTRIC;
    private double maxfuel;
    private double currentfuel;

    public Engine(String FuelType, double maxfuel, double currentfuel) {
        //this.FuelType = FuelType;
        this.maxfuel = maxfuel;
        this.currentfuel = currentfuel;
    }
    public String getFuelType() {
        return this.FuelType;
    }

    public double getmaxfuel() {
        return this.maxfuel;
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
    
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}