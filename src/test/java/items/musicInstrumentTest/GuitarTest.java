package items.musicInstrumentTest;

import items.Description;
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
        myGuitar = new Guitar(80,125 ,InstrumentCategory.GUITAR, "Epiphone", 96.5,"ebony",GuitarType.ACOUSTIC,6,"steel");
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

    @Test
    public void canGetPropertiesFromSuper() {
        assertEquals(InstrumentCategory.GUITAR,myGuitar.getCategory());
        assertEquals("Epiphone",myGuitar.getBrand());
        assertEquals(96.5,myGuitar.getSize(),0.00);
        assertEquals("ebony",myGuitar.getMaterial());
        assertEquals(80,myGuitar.getBuyPrice(), 0.00);
        assertEquals(125,myGuitar.getSellPrice(), 0.00);
    }

    @Test
    public void canCalculateMarkupPrice() {
        assertEquals(45.00,myGuitar.calculateMarkup(),0.05);
    }

    @Test
    public void canPlay() {
        assertEquals("Piiiiing ponnnnnnng",myGuitar.play());
    }

    @Test
    public void hasDescription() {
        assertEquals(Description.MUSICAL_INSTRUMENT,myGuitar.getDescription());
    }
}