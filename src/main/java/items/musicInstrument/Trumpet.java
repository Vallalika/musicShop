package items.musicInstrument;

public class Trumpet extends MusicInstrument {

    private int numberOfValves;
    private TrumpetType type;

    public Trumpet(InstrumentCategory category, String brand, double size, String material, double buyPrice, double sellPrice,TrumpetType type) {
        super(category, brand, size, material, buyPrice, sellPrice);
        this.type = type;
        this.numberOfValves = 3;
    }

    public TrumpetType getType() {
        return type;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }


}
