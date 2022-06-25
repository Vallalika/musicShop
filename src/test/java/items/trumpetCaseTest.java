package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class trumpetCaseTest {


    private TrumpetCase myTCase ;

    @Before
    public void before() {
        myTCase = new TrumpetCase(Description.TRUMPET_CASE,70,150);
    }

    @Test
    public void canGetDescription() {
        assertEquals(Description.TRUMPET_CASE,myTCase.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(70,myTCase.getBuyPrice(),0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(150,myTCase.getSellPrice(),0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(80.00,myTCase.calculateMarkup(),0.00);
    }

}
