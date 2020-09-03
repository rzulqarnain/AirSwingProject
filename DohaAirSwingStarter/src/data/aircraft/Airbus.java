package data.aircraft;

public class Airbus extends Aircraft {

    public static String[] MODELS = {"A320", "A330", "A340", "A350", "A380"};

    public Airbus(String id, String model) {
        super(id, find("Airbus", MANUFACTURERS), find(model, MODELS));
    }

    @Override
    public String getModel() {
        return MODELS[model];
    }
}
