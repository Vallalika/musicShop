package items;

import items.musicInstrument.GuitarType;
import items.musicInstrument.Trumpet;
import items.musicInstrument.TrumpetType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet myTrumpet;

    @Before
    public void before() {
        myTrumpet = new Trumpet(TrumpetType.C);
    }

    @Test
    public void canGetTrumpetType() {
        assertEquals(TrumpetType.C,myTrumpet.getType());
    }

    @Test
    public void hasThreeValves() {
        assertEquals(3,myTrumpet.getNumberOfValves());
    }

}