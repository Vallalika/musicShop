package items;

public class MusicSheet extends ItemsForSale {

    private String composer;
    private String genre;

    public MusicSheet(Description description, double buyPrice, double sellPrice, String composer, String genre) {
        super(description, buyPrice, sellPrice);
        this.composer = composer;
        this.genre = genre;
    }

    public String getComposer() {
        return composer;
    }

    public String getGenre() {
        return genre;
    }
}
