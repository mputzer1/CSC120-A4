import java.util.ArrayList;

import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

public class Car {
    private Passenger Passenger;
    private int capacity;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>(capacity);

    public Car(Passenger Passenger, int capacity) {
        this.Passenger = Passenger;
        this.capacity = capacity;  
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
            passengers.add(name); 
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean removePassenger(String name) {
        if (passengers.contains(name)) {
            passengers.remove(name);
            return true;
        }
        else {
            return false;
        }
    }
    
    public void printManifest() {
        for(int i=0; i < passengers.size(); i++) {
            System.out.println(passengers.get(i));
        }
    }
    
}
    



