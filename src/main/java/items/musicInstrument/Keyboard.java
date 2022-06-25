package items.musicInstrument;

public class Keyboard extends MusicInstrument {

    private int numberOfKeys;
    private int numberOfPedals;
    private KeyboardType type;

    public Keyboard(InstrumentCategory category, String brand, double size, String material, double buyPrice, double sellPrice,KeyboardType type, int numberOfKeys) {
        super(category, brand, size, material, buyPrice, sellPrice);
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
