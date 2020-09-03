package data.passenger;

import data.Data;

public abstract class Passenger extends Data {

    public Passenger(String name) {
        super(name);
    }

    public String getName() {
        return getId();
    }

    @Override
    public String toString() {
        String result = "Passenger " + getName() + " (points";

        
        
        return result + ")";
    }

    @Override
    public String type() {
        return "Passenger";
    }
}
