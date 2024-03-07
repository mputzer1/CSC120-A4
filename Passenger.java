/**
 * The Passenger class which stores the passenger name
 */

public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

     /**
     * Getter for name of passenger
     * @return this.name
     */
    public String getname() {
        return this.name;
    }

    /**
     * Adds passenger to the car if addPassenger method returns true and returns true. Otherwise, returns false.
     * @param Car
     */
    public boolean boardCar(Car c) {
        if (c.addPassenger(this)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Removes passenger from car if removePassenger method returns true and returns true. Otherwise, returns false.
     * @param Car
     */
    public boolean getOffCar(Car c) {
        if (c.removePassenger(this)) {
            return true;
        }
        else {
            return false;
        }
    }
    }
