package data.passenger;

public class Child extends Passenger {

    private final boolean crib;

    public Child(String name, boolean crib) {
        super(name);
        this.crib = crib;
    }

    @Override
    public String toString() {
        return super.toString() + " (child, Crib = " + getCrib() + ")";
    }

    public boolean getCrib() {
        return crib;
    }
}
