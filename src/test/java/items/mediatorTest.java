package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mediatorTest {

    private Mediator myMediator;

    @Before
    public void before() {
        myMediator = new Mediator(Description.MEDIATOR,1.50,4.50);
    }

    @Test
    public void canGetDescription() {
        assertEquals(Description.MEDIATOR,myMediator.getDescription());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1.50,myMediator.getBuyPrice(),0.00);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(4.50,myMediator.getSellPrice(),0.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3.00,myMediator.calculateMarkup(),0.00);
    }
}
