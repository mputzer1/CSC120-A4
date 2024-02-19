public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    private void boardCar(Car Car) {
        Car.addPassenger(this.name);
    }
}
