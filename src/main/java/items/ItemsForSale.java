package items;

import behaviours.ISell;

public abstract class ItemsForSale implements ISell {

    private Description description;
    private double buyPrice;
    private double sellPrice;

    public ItemsForSale(Description description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        double markup = this.sellPrice-this.buyPrice;
        return markup;
    }

    public Description getDescription() {
        return this.description;
    }
}
