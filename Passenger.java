public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car Car) {
        if (Car.addPassenger(this.name)) {
            Car.addPassenger(this.name);
            }
    }
     
    public void getOffCar(Car Car) {
        if (Car.removePassenger(this.name)) {
            Car.removePassenger(this.name);
        }
    }

    }
