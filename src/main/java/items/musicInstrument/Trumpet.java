package items.musicInstrument;

public class Trumpet {

    private int numberOfValves;
    private TrumpetType type;

    public Trumpet(TrumpetType type) {
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
