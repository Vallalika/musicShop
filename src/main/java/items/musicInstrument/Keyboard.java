package items.musicInstrument;

public class Keyboard {

    private int numberOfKeys;
    private int numberOfPedals;
    private KeyboardType type;

    public Keyboard(KeyboardType type, int numberOfKeys) {
        this.type = type;
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = 3;
    }

    public KeyboardType getType() {
        return type;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
