package stock;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StockInstrumentTest {

    Keyboard piano;
    BigDecimal buyingPrice;
    BigDecimal sellingPrice;
    StockInstrument stockPiano;

    @Before
    public void before(){
        piano = new Keyboard("Piano", InstrumentType.KEYBOARD, SubType.PIANO, MaterialType.WOOD, "Plinky plonk", 2);
        buyingPrice = new BigDecimal(20000.00);
        sellingPrice = new BigDecimal(27000.00);
        stockPiano = new StockInstrument("Steinway concert grand piano", piano, buyingPrice, sellingPrice);
    }





    @Test
    public void hasDescription(){
        assertEquals("Steinway concert grand piano", stockPiano.getDescription());
    }

    @Test
    public void hasItem(){
        assertEquals(piano, stockPiano.getItem());
    }

    @Test
    public void hasBuyingPrice(){
        assertTrue(BigDecimal.valueOf(20000.00).compareTo(stockPiano.getBuyingPrice()) == 0);
        assertEquals(20000.00, stockPiano.getBuyingPrice().doubleValue(), 0.0);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(27000.00, stockPiano.getSellingPrice().doubleValue(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(7000.00, stockPiano.calculateMarkup().doubleValue(), 0.0);
    }
}