package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class musicSheetTest {

    private MusicSheet chiMai ;

    @Before
    public void before() {
        chiMai = new MusicSheet(Description.MUSIC_SHEET,3,10, "Ennio Morricone","Movie Soundtrack");
    }

    @Test
    public void canGetDescription() {
        assertEquals(Description.MUSIC_SHEET,chiMai.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(3,chiMai.getBuyPrice(),0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10,chiMai.getSellPrice(),0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(7.00,chiMai.calculateMarkup(),0.00);
    }

    @Test
    public void canGetComposer() {
        assertEquals("Ennio Morricone",chiMai.getComposer());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Movie Soundtrack",chiMai.getGenre());
    }
}
