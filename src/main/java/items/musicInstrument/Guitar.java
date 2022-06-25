package items.musicInstrument;

public class Guitar {

    private int numberOfStrings;
    private String stringMaterial;
    private GuitarType type;

    public Guitar(GuitarType type, int numberOfStrings, String stringMaterial) {
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
