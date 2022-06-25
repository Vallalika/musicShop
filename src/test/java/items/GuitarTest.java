package items;

import items.musicInstrument.Guitar;
import items.musicInstrument.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar myGuitar;

    @Before
    public void before() {
        myGuitar = new Guitar(GuitarType.ACOUSTIC,6,"steel");
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ACOUSTIC,myGuitar.getType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6,myGuitar.getNumberOfStrings());
    }

    @Test
    public void canGetStringMaterial() {
        assertEquals("steel", myGuitar.getStringMaterial());
    }
}