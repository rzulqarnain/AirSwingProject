package data.flight;

import data.route.Route;
import data.Data;
import data.aircraft.Aircraft;
import data.destination.Destination;
import java.awt.Graphics;

public class Flight extends Data {

    private final Aircraft aircraft;
    private final Route route;
    private final String time;

    public Flight(String number, Aircraft aircraft, Route route, String time) {
        super(number);
        this.aircraft = aircraft;
        this.route = route;
        this.time = time;
    }

    public String getNumber() {
        return getId();
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public Route getRoute() {
        return route;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Flight " + getNumber() + " on " + getAircraft() + " on " + getRoute() + " at " + getTime();
    }

    @Override
    public String type() {
        return "Flight";
    }

    public void draw(Graphics g) {
        Destination from = route.getFrom();
        Destination to = route.getTo();
        g.drawLine(from.getMapX(), from.getMapY(), to.getMapX(), to.getMapY());
    }
}
