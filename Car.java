import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Car {
    private int capacity;
    private ArrayList<String> passengers = new ArrayList<String>();

    private Car(int capacity) {
        this.capacity = capacity;
        passengers.ensureCapacity(this.capacity);   
    }

    private int getCapacity() {
        return this.capacity;
    }

    private int seatsRemaining() {
        int arraysize = passengers.size();
        int remainingseats = this.capacity - arraysize;
        return remainingseats;
    }

    private boolean addPassenger(String Passenger) {
        if (seatsRemaining() > 0) {
            passengers.add(Passenger);
            return true;
        }
        else {
            return false;
        }
    }
    
    private boolean removePassenger(String Passenger) {
        if (passengers.contains(Passenger)) {
            passengers.remove(Passenger);
            return true;
        }
        else {
            return false;
        }
    }
    
    private void printManifest() {
        System.out.println(passengers);
    }
    
    
    }



