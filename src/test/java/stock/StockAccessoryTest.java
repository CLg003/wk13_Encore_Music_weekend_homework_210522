package stock;

import instruments.InstrumentType;
import instruments.SubType;
import noninstrumental.Accessory;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StockAccessoryTest {

    Accessory guitarStrings;
    BigDecimal buyingPrice;
    BigDecimal sellingPrice;
    StockAccessory stockGuitarStrings;

    @Before
    public void before(){
        guitarStrings = new Accessory("Guitar strings", "Gibson", InstrumentType.STRING, SubType.PLUCKED);
        buyingPrice = new BigDecimal(4.50);
        sellingPrice = new BigDecimal(9.79);
        stockGuitarStrings = new StockAccessory("Set of Gibson electric guitar strings", guitarStrings, buyingPrice, sellingPrice);
    }

    @Test
    public void hasDescription(){
        assertEquals("Set of Gibson electric guitar strings", stockGuitarStrings.getDescription());
    }

    @Test
    public void hasItem(){
        assertEquals(guitarStrings, stockGuitarStrings.getItem());
    }

    @Test
    public void hasBuyingPrice(){
        assertTrue(BigDecimal.valueOf(4.50).compareTo(stockGuitarStrings.getBuyingPrice()) == 0);
        assertEquals(4.50, stockGuitarStrings.getBuyingPrice().doubleValue(), 0.0);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(9.79, stockGuitarStrings.getSellingPrice().doubleValue(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.29, stockGuitarStrings.calculateMarkup().doubleValue(), 0.0);
    }
}