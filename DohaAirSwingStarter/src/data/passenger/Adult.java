package data.passenger;

public class Adult extends Passenger {

    private final int ffn;

    public Adult(String name, int ffn) {
        super(name);
        this.ffn = ffn;
    }

    @Override
    public String toString() {
        return super.toString() + " (adult, FFN = " + getFFN() + ")";
    }

    public int getFFN() {
        return ffn;
    }
}
