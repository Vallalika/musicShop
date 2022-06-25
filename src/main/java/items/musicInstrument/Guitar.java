package items.musicInstrument;

public class Guitar extends MusicInstrument {

    private int numberOfStrings;
    private String stringMaterial;
    private GuitarType type;

    public Guitar(InstrumentCategory category, String brand, double size, String material, double buyPrice, double sellPrice,GuitarType type, int numberOfStrings, String stringMaterial) {
        super(category, brand, size, material, buyPrice, sellPrice);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.stringMaterial = stringMaterial;
    }

    public GuitarType getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getStringMaterial() {
        return stringMaterial;
    }
}
