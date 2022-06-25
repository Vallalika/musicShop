package items;

import items.musicInstrument.GuitarType;
import items.musicInstrument.Keyboard;
import items.musicInstrument.KeyboardType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    private Keyboard myPiano;

    @Before
    public void before() {
        myPiano = new Keyboard(KeyboardType.BABY_GRAND_PIANO,88);
    }

    @Test
    public void canGetKeyboardType() {
        assertEquals(KeyboardType.BABY_GRAND_PIANO,myPiano.getType());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88,myPiano.getNumberOfKeys());
    }

    @Test
    public void hasThreePedals() {
        assertEquals(3, myPiano.getNumberOfPedals());
    }

}