package items.musicInstrument;

public abstract class MusicInstrument {

    private InstrumentCategory category;
    private String brand;
    private double size;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public MusicInstrument(InstrumentCategory category,  String brand, double size, String material, double buyPrice, double sellPrice) {
        this.category = category;
        this.brand = brand;
        this.size = size;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
