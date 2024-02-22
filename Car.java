import java.util.ArrayList;

import javax.net.ssl.TrustManager;
import javax.swing.plaf.TreeUI;

/**
 * The car class which stores passengers, the capacity of the car, and an arraylist to keep track of all passengers
 */
public class Car {
    private int capacity;
    private Passenger passenger;
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>(capacity);

    public Car(int capacity, Passenger passenger) {
        this.capacity = capacity;  
        this.passenger = passenger;
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
        int arraysize = passengers.size();
        int remainingseats = this.capacity - arraysize;
        return remainingseats;
    }

    /**
     * Adds a passenger if there are enough seats remaining and returns true. Returns false if not enough seats.
     * @param name
     * @return boolean
     */
    public boolean addPassenger(String name) { 
        if (seatsRemaining() > 0) {
            passengers.add(this.passenger); 
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
    public boolean removePassenger(String name) {
        if (passengers.contains(this.passenger)) {
            passengers.remove(this.passenger);
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
        if (passengers.size() > 0) {
            for(int i=0; i < passengers.size(); i++) {
                System.out.println(passengers.get(i));
            }
        }
        else {
            System.out.println("This car is empty");
        }
    }

}
    



