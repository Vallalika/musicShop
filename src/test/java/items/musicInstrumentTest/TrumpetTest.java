package items.musicInstrumentTest;

import items.musicInstrument.GuitarType;
import items.musicInstrument.InstrumentCategory;
import items.musicInstrument.Trumpet;
import items.musicInstrument.TrumpetType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet myTrumpet;

    @Before
    public void before() {
        myTrumpet = new Trumpet(InstrumentCategory.TRUMPET,"Yamaha",60,"brass",1500, 2000 ,TrumpetType.C);
    }

    @Test
    public void canGetTrumpetType() {
        assertEquals(TrumpetType.C,myTrumpet.getType());
    }

    @Test
    public void hasThreeValves() {
        assertEquals(3,myTrumpet.getNumberOfValves());
    }

    @Test
    public void canGetPropertiesFromSuper() {
        assertEquals(InstrumentCategory.TRUMPET,myTrumpet.getCategory());
        assertEquals("Yamaha",myTrumpet.getBrand());
        assertEquals(60,myTrumpet.getSize(),0.00);
        assertEquals("brass",myTrumpet.getMaterial());
        assertEquals(1500,myTrumpet.getBuyPrice(), 0.00);
        assertEquals(2000,myTrumpet.getSellPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkupPrice() {
        assertEquals(500.00,myTrumpet.calculateMarkup(),0.05);
    }

    @Test
    public void canPlay() {
        assertEquals("Pwooo pwwwwwwwwwiiiiiiiit",myTrumpet.play());
    }

}