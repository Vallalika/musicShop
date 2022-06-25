package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class keyboardSeatTest {

    private KeyboardSeat myKeyboardSeat;

    @Before
    public void before() {
        myKeyboardSeat = new KeyboardSeat(Description.KEYBOARD_SEAT,72,105);
    }

    @Test
    public void canGetDescription() {
        assertEquals(Description.KEYBOARD_SEAT,myKeyboardSeat.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(72,myKeyboardSeat.getBuyPrice(),0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(105,myKeyboardSeat.getSellPrice(),0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(33.00,myKeyboardSeat.calculateMarkup(),0.00);
    }
}
