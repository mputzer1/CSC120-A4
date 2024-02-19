import java.util.ArrayList;

public class Car {
    private int capacity;
    private ArrayList<String> passengers = new ArrayList<String>();

    public Car(int capacity) {
        this.capacity = capacity;
        passengers.ensureCapacity(this.capacity);   
    }

    public int getCapcity() {
        return this.capacity;
    }

    public int seatsRemaining() {
        
    }


}


