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
    public void boardCar(Car Car) {
        if (Car.addPassenger(this.name)) {
            Car.addPassenger(this.name);
            }
    }
    
    /**
     * removes passenger from car
     * @param Car
     */
    public void getOffCar(Car Car) {
        if (Car.removePassenger(this.name)) {
            Car.removePassenger(this.name);
        }
    }

    }
