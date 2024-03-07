import java.util.ArrayList;

/**
 * Train class which contains the number of cars, the engine, an arraylist of cars, the fuel type, the fuel capacity, and the passenger capacity
 */
public class Train {
    private int ncars;
    private Engine engine;
    private ArrayList<Car> cars;
    private FuelType fuelType;
    private double fuelcapacity;
    private int passengercapacity;

    public Train(FuelType fuelType, double fuelcapacity, int ncars, int passengercapacity) {
        this.engine = new Engine(this.fuelType, 60, this.fuelcapacity);
        this.passengercapacity = passengercapacity;
        this.cars = new ArrayList<Car>();
        this.ncars = this.cars.size();

    }

    /**
     * Getter for the engine class
     * @return this.engine
     */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Intended to return the ith car.
     * @return ith car.
     */
    public Car getCar(int i) {
        Car icar = this.cars.get(i);
        return icar;
    }

    /**
     * Gets the max capacity across all cars for passengers
     * @return the passengercapcity across all cars for passengers
     */
    public int getMaxCapacity() {
        for(int i=0; i < this.ncars; i++) {
            this.passengercapacity += this.cars.get(i).getCapacity();
        }
        return this.passengercapacity;
    }

    /**
     * Returns the number of seats remaining across all cars
     * @return the number of remaining seats across all cars
     */
    public int seatsRemaining() {
        int seatsRemaining = this.passengercapacity;
        for(int i=0; i < this.ncars; i++) {
            seatsRemaining -= this.cars.get(i).seatsRemaining();
        }
        int allremainingseats = this.passengercapacity-seatsRemaining;
        return allremainingseats;
    }
    

    /**
     * Prints all passengers oboard if the train has passengers. If not, it prints that the train is empty.
     */
    public void printManifest() {
        if (seatsRemaining() != this.passengercapacity) {
            for(int i=0; i < this.ncars; i++) {
                cars.get(i).printManifest();
            }
        }
        else {
            System.out.println("This train is empty");
        }
    }


    /**
     * This is a general main to test all the classes of the train. The engine class functions appropriately, but the other classes are still being built.
     * @param args
     */
    public static void main(String[] args) {
        Car car1 = new Car(12);
        System.out.println("\nSeats Remaining:" + car1.seatsRemaining());
        car1.printManifest();
        Passenger p = new Passenger("Joe");
        p.boardCar(car1);
        Passenger s = new Passenger("Mariah");
        s.boardCar(car1);
        System.out.println("\nSeats Remaining:" + car1.seatsRemaining());
        car1.printManifest(); 
    }
}



 
    
