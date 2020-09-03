package data.aircraft;

import data.Data;
import java.awt.Image;
import utilities.Images;

public abstract class Aircraft extends Data {

    public static String[] MANUFACTURERS = {"Boeing", "Airbus"};
    
    static protected int find(String item, String[] items) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        System.out.println("Aircraft find: warning, " + item + " not in " + items.toString());
        return -1;
    }
    
    public static String[] getModels(String type) {
        if (type.equals(Boeing.class.getSimpleName())) {
            return Boeing.MODELS;
        } else if (type.equals(Airbus.class.getSimpleName())) {
            return Airbus.MODELS;
        } else {
            return null;
        }
    }

    protected final int manufacturer;
    protected final int model;
    
    public Aircraft(String id, int manufacturer, int model) {
        super(id);
        this.manufacturer = manufacturer;
        this.model = model;
    }
    
    public String getManufacturer() {
        return MANUFACTURERS[manufacturer];
    }
    
    public abstract String getModel();

    @Override
    public String toString() {
        return "Aircraft " + getManufacturer() + " " + getModel() + " (ID " + getId() + ")";
    }
    
    @Override
    public String type() {
        return "Aircraft";
    }
}
