package items.musicInstrument;

public enum InstrumentCategory {

    GUITAR("Guitar"),
    KEYBOARD("Keyboard"),
    TRUMPET("Trumpet");

    private final String displayName;

    InstrumentCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

}