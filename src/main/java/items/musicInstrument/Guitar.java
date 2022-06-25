package items.musicInstrument;

public class Guitar extends MusicInstrument {

    private int numberOfStrings;
    private String stringMaterial;
    private GuitarType type;

    public Guitar(double buyPrice, double sellPrice,InstrumentCategory category, String brand, double size, String material, GuitarType type, int numberOfStrings, String stringMaterial) {
        super(buyPrice, sellPrice, category, brand, size, material);
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

    @Override
    public String play() {
        return "Piiiiing ponnnnnnng";
    }

}
