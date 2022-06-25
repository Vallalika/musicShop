package items;

import items.musicInstrument.Guitar;
import items.musicInstrument.GuitarType;
import items.musicInstrument.InstrumentCategory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar myGuitar;

    @Before
    public void before() {
        myGuitar = new Guitar(InstrumentCategory.GUITAR, "Epiphone", 96.5,"ebony", 80,125 ,GuitarType.ACOUSTIC,6,"steel");
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
        assertEquals("ebony", myGuitar.getStringMaterial());
    }

    @Test
    public void canGetPropertiesFromSuper() {
        assertEquals(InstrumentCategory.GUITAR,myGuitar.getCategory());
        assertEquals("Epiphone",myGuitar.getBrand());
        assertEquals(96.5,myGuitar.getSize(),0.00);
        assertEquals("steel",myGuitar.getMaterial());
        assertEquals(80,myGuitar.getBuyPrice(), 0.00);
        assertEquals(125,myGuitar.getSellPrice(), 0.00);
    }
}