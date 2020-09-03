package data.aircraft;

public class Boeing extends Aircraft {
    
    public static String[] MODELS = {"737", "747", "777", "787"};

    public Boeing(String id, String model) {
        super(id, find("Boeing", MANUFACTURERS), find(model, MODELS));
    }

    @Override
    public String getModel() {
        return MODELS[model];
    }
}
