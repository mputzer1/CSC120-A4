import java.util.ArrayList;

import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

/**
 * The car class which stores passengers, the capacity of the car, and an arraylist to keep track of all passengers
 */
public class Car {
    private int capacity;
    private ArrayList<Passenger> passengers;

    public Car(int capacity) {
        this.capacity = capacity;  
        this.passengers = new ArrayList<Passenger>();
    }

    /**
     * Getter for capacity
     * @return this.capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Determines how many seats are left in the car
     * @return remaining seats in car
     */
    public int seatsRemaining() {
        int arraysize = this.passengers.size();
        int remainingseats = this.capacity - arraysize;
        return remainingseats;
    }

    /**
     * Adds a passenger if there are enough seats remaining and returns true. Returns false if not enough seats.
     * @param name
     * @return boolean
     */
    public boolean addPassenger(Passenger p) { 
        if (seatsRemaining() > 0) {
            this.passengers.add(p); 
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Removes a passenger if the passenger is already in the car and returns true. Returns false if passenger is not in the car.
     * @param name
     * @return boolean
     */
    public boolean removePassenger(Passenger p) {
        if (this.passengers.contains(p)) {
            this.passengers.remove(p);
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Prints all passengers in the car if the car has passengers. If not, it prints that the car is empty.
     */
    public void printManifest() {
        if (this.passengers.size() > 0) {
            System.out.println("\nPASSENGERS ONBOARD:");
            for(int i=0; i < this.passengers.size(); i++) {
                System.out.println(this.passengers.get(i).getname());
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
    }
}
    



