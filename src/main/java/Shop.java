
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<ISell> stock;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return shopName;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

}
