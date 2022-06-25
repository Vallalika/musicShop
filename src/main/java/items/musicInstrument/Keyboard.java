package items.musicInstrument;

public class Keyboard extends MusicInstrument {

    private int numberOfKeys;
    private int numberOfPedals;
    private KeyboardType type;

    public Keyboard(double buyPrice, double sellPrice, InstrumentCategory category, String brand, double size, String material, KeyboardType type, int numberOfKeys) {
        super(buyPrice, sellPrice,category, brand, size, material);
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

    @Override
    public String play() {
        return "do re mi fa sol la si do";
    }
}
