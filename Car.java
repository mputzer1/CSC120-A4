import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Car {
    private Passenger Passenger;
    private static int capacity = 500;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    public Car(Passenger Passenger, ArrayList<Passenger> passengers) {
        this.Passenger = Passenger;
        this.passengers = passengers;
        this.passengers.ensureCapacity(capacity);   
    }

    public static int getCapacity() {
        return capacity;
    }

    public int seatsRemaining() {
        int arraysize = passengers.size();
        int remainingseats = capacity - arraysize;
        return remainingseats;
    }

    public boolean addPassenger(String name) { 
        if (seatsRemaining() > 0) {
            this.passengers.add(this.Passenger); 
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean removePassenger(String name) {
        if (this.passengers.contains(this.Passenger)) {
            this.passengers.remove(this.Passenger);
            return true;
        }
        else {
            return false;
        }
    }
    
    public void printManifest() {
        System.out.println(passengers);
    }

    }
    



