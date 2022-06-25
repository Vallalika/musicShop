package items.musicInstrument;

public class Trumpet extends MusicInstrument {

    private int numberOfValves;
    private TrumpetType type;

    public Trumpet(double buyPrice, double sellPrice,InstrumentCategory category, String brand, double size, String material, TrumpetType type) {
        super(buyPrice, sellPrice, category,brand, size, material);
        this.type = type;
        this.numberOfValves = 3;
    }

    public TrumpetType getType() {
        return type;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }


    @Override
    public String play() {
        return "Pwooo pwwwwwwwwwiiiiiiiit";
    }

}
