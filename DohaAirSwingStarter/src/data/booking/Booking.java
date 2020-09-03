package data.booking;

import data.Data;
import data.flight.Flight;
import data.passenger.Passenger;

public class Booking extends Data {

    private final Passenger passenger;
    private final Flight flight;

    public Booking(Passenger passenger, Flight flight) {
        super(passenger.getId() + "-" + flight.getId());
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return getPassenger() + " flying on " + getFlight();
    }

    @Override
    public String type() {
        return "Booking";
    }

}
