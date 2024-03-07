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
     * Adds passenger to the car
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
     * removes passenger from car
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
