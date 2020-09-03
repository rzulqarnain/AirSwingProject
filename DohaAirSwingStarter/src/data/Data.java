package data;

public abstract class Data {

    private final String id;

    public Data(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id;
    }

    public abstract String type();
}
