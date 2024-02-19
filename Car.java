import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Car {
    private int capacity;
    private ArrayList<String> passengers = new ArrayList<String>();

    public Car(int capacity) {
        this.capacity = capacity;
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

    public boolean addPassenger(String Passenger) {
        if (seatsRemaining() > 0) {
            passengers.add(Passenger);
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean removePassenger(String Passenger) {
        if (passengers.contains(Passenger)) {
            passengers.remove(Passenger);
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



