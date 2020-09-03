package data.destination;

import data.Data;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Destination extends Data {

    private final String city;
    private final int mapX;
    private final int mapY;

    public Destination(String code, String city, int mapX, int mapY) {
        super(code);
        this.city = city;
        this.mapX = mapX;
        this.mapY = mapY;
    }

    public String getCode() {
        return getId();
    }

    public String getCity() {
        return city;
    }

    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }

    @Override
    public String toString() {
        return "Destination " + getCity() + " (" + getCode() + ")";
    }

    @Override
    public String type() {
        return "Destination";
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(mapX - 5, mapY - 5, 10, 10);
        g.setFont(new Font("Helvetica", Font.PLAIN, 10));
        g.drawString("(" + getCode() + ")", mapX - 15, mapY - 20);
    }
}
