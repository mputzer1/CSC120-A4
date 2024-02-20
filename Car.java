import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Car {
    private Passenger Passenger;
    private int capacity;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    public Car(int capacity, Passenger Passenger) {
        this.capacity = capacity;
        this.Passenger = Passenger;
        passengers.ensureCapacity(this.capacity);   
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int seatsRemaining() {
        int arraysize = passengers.size();
        int remainingseats = this.capacity - arraysize;
        return remainingseats;
    }

    public boolean addPassenger(String name) { 
        if (seatsRemaining() > 0) {
            passengers.add(this.Passenger); 
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean removePassenger(String name) {
        if (passengers.contains(this.Passenger)) {
            passengers.remove(this.Passenger);
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



