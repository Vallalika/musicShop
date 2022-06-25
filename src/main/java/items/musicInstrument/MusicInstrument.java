package items.musicInstrument;

import behaviours.IPlay;
import behaviours.ISell;
import items.Description;
import items.ItemsForSale;

public abstract class MusicInstrument extends ItemsForSale implements IPlay {

    private InstrumentCategory category;
    private String brand;
    private double size;
    private String material;
    private double buyPrice;
    private double sellPrice;

    public MusicInstrument(double buyPrice, double sellPrice,InstrumentCategory category,  String brand, double size, String material) {
        super(Description.MUSICAL_INSTRUMENT, buyPrice, sellPrice);
        this.category = category;
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    public InstrumentCategory getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }


}
