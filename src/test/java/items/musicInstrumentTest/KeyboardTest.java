package items.musicInstrumentTest;

import items.Description;
import items.musicInstrument.GuitarType;
import items.musicInstrument.InstrumentCategory;
import items.musicInstrument.Keyboard;
import items.musicInstrument.KeyboardType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    private Keyboard myPiano;

    @Before
    public void before() {
        myPiano = new Keyboard(50000,80000,InstrumentCategory.KEYBOARD,"Yamaha", 162,"spruce", KeyboardType.BABY_GRAND_PIANO.BABY_GRAND_PIANO,88);
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

    @Test
    public void canGetPropertiesFromSuper() {
        assertEquals(InstrumentCategory.KEYBOARD,myPiano.getCategory());
        assertEquals("Yamaha",myPiano.getBrand());
        assertEquals(162,myPiano.getSize(),0.00);
        assertEquals("spruce",myPiano.getMaterial());
        assertEquals(50000,myPiano.getBuyPrice(), 0.00);
        assertEquals(80000,myPiano.getSellPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkupPrice() {
        assertEquals(30000.00,myPiano.calculateMarkup(),0.05);
    }

    @Test
    public void canPlay() {
        assertEquals("do re mi fa sol la si do",myPiano.play());
    }

    @Test
    public void HasDescription() {
        assertEquals(Description.MUSICAL_INSTRUMENT,myPiano.getDescription());
    }

}