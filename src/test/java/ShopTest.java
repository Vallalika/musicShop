import items.Description;
import items.KeyboardSeat;
import items.musicInstrument.Guitar;
import items.musicInstrument.GuitarType;
import items.musicInstrument.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop myMusicShop;

    @Before
    public void before() {
        myMusicShop = new Shop("My Music Shop");
    }

    @Test
    public void canGetName() {
        assertEquals("My Music Shop",myMusicShop.getName());
    }

    @Test
    public void startsWithNoStock() {
        assertEquals(0, myMusicShop.getStock().size());
    }

    @Test
    public void canAddItemToStock() {
        KeyboardSeat myKeyboardSeat = new KeyboardSeat(Description.KEYBOARD_SEAT,72,105);
        myMusicShop.addToStock(myKeyboardSeat);
        assertEquals(1, myMusicShop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        KeyboardSeat myKeyboardSeat = new KeyboardSeat(Description.KEYBOARD_SEAT,72,105);
        Guitar myGuitar = new Guitar(80,125 , InstrumentCategory.GUITAR, "Epiphone", 96.5,"ebony", GuitarType.ACOUSTIC,6,"steel");
        myMusicShop.addToStock(myKeyboardSeat);
        myMusicShop.addToStock(myGuitar);
        myMusicShop.removeFromStock(myKeyboardSeat);
        assertEquals(1, myMusicShop.getStock().size());
    }
}
