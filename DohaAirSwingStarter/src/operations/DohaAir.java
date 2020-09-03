package operations;

import data.Data;
import data.aircraft.Aircraft;
import data.booking.Booking;
import data.destination.Destination;
import data.flight.Flight;
import data.route.Route;
import data.passenger.Passenger;
import java.awt.Color;
import java.awt.Graphics;
import static java.util.Arrays.sort;

public class DohaAir {

    private static final int MAX = 20;

    private final Passenger[] passengers;
    private final Aircraft[] aircraft;
    private final Destination[] destinations;
    private final Route[] routes;
    private final Booking[] bookings;
    private final Flight[] flights;

    public DohaAir() {
        aircraft = new Aircraft[MAX];
        destinations = new Destination[MAX];
        routes = new Route[MAX];
        passengers = new Passenger[MAX];
        bookings = new Booking[MAX];
        flights = new Flight[MAX];
    }

    public String create(Data id) {
        return create1(id, "created");
    }

    public String schedule(Data id) {
        return create1(id, "scheduled");
    }

    public String book(Data id) {
        return create1(id, "booked");
    }

    private String create1(Data id, String action) {
        if (find(id) != null) {
            return find(id) + " already " + action;
        }

        store(id);
        return find(id) + " " + action;
    }

    /**
     *
     * @return A listing of all {@code Passenger} objects.
     */
    public String report(String report, String type, String id) {
        Data[] array = selectArray(type);
        String result = "\n" + report + ":\n";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if ( // all: all items in the array
                        report.equals("ALL")
                        // or itinerary: all bookings for a passenger
                        || (report.equals("ITINERARY") && type.equals("Booking") && ((Booking) array[i]).getPassenger().getId().equals(id))
                        // or manifest: all passengers for a flight
                        || (report.equals("MANIFEST") && type.equals("Booking") && ((Booking) array[i]).getFlight().getId().equals(id))
                        // or schedule: all flights for an aircraft
                        || (report.equals("SCHEDULE") && type.equals("Flight") && ((Flight) array[i]).getAircraft().getId().equals(id))) {
                    result += array[i] + "\n";
                }
            }
        }
        return result;
    }

    private Data[] selectArray(String type) {
        if (type.equals("Passenger")) {
            return passengers;
        } else if (type.equals("Destination")) {
            return destinations;
        } else if (type.equals("Route")) {
            return routes;
        } else if (type.equals("Flight")) {
            return flights;
        } else if (type.equals("Aircraft")) {
            return aircraft;
        } else if (type.equals("Booking")) {
            return bookings;
        } else {
            System.out.println("In selectArray: type = " + type);
            return null;
        }
    }

    public String[] getIds(String type) {
        Data[] ids = selectArray(type);
        String[] result = new String[size(ids)];
        for (int i = 0, j = 0; i < ids.length; i++) {
            if (ids[i] != null) {
                result[j] = ids[i].getId();
                j++;
            }
        }
        sort(result);
        return result;
    }

    private Data find(Data id) {
        return find(id.getId(), id.type());
    }

    public Passenger findPassenger(String id) {
        return (Passenger) find(id,"Passenger");
    }
    
    public Destination findDestination(String id) {
        return (Destination) find(id,"Destination");
    }
    
    public Aircraft findAircraft(String id) {
        return (Aircraft) find(id,"Aircraft");
    }
    
    public Flight findFlight(String id) {
        return (Flight) find(id,"Flight");
    }
    
    public Booking findBooking(String id) {
        return (Booking) find(id,"Booking");
    }
    
    public Route findRoute(String id) {
        return (Route) find(id,"Route");
    }
    
    private Data find(String id, String type) {
        System.out.println("find: " + id + " " + type);
        Data[] array = selectArray(type);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getId().equals(id)) {
                return array[i];
            }
        }
        return null;
    }

    private void store(Data id) {
        Data[] array = selectArray(id.type());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = id;
                return;
            }
        }
        System.out.println("store: array full, cannot store" + id);
    }

    private int size(Data[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void draw(Graphics g) {

        // draw all destinations
        for (int i = 0; i < destinations.length; i++) {
            if (destinations[i] != null) {
                destinations[i].draw(g);
            }
        }

        // draw all flights
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                flights[i].draw(g);
            }
        }
    }
}
