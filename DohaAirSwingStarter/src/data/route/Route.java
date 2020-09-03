package data.route;

import data.Data;
import data.destination.Destination;

public class Route extends Data {
    
    private final Destination from;
    private final Destination to;
    private final int points;

    public Route(Destination from, Destination to, int points) {
        super(from.getCode() + "-" + to.getCode());
        this.from = from;
        this.to = to;
        this.points = points;
    }

    public Destination getFrom() {
        return from;
    }

    public Destination getTo() {
        return to;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Route from " + from + " to " + to + " (" + points + " points)";
    }

    @Override
    public String type() {
        return "Route";
    }
}
