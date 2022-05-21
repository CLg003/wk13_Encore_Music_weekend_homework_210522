package stock;

import instruments.InstrumentType;
import instruments.Keyboard;
import instruments.MaterialType;
import instruments.SubType;
import noninstrumental.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class StockSheetMusicTest {

    Keyboard electricKeyboard;
    SheetMusic movieFavourites;
    BigDecimal buyingPrice;
    BigDecimal sellingPrice;
    StockSheetMusic stockSheetMusic;

    @Before
    public void before(){
        electricKeyboard = new Keyboard("Electric Keyboard", InstrumentType.KEYBOARD, SubType.KEYBOARD, MaterialType.PLASTIC, "Dinky donk", 0);
        movieFavourites = new SheetMusic("Movie Favourites", "John Williams", electricKeyboard);
        buyingPrice = new BigDecimal(4.00);
        sellingPrice = new BigDecimal(7.00);
        stockSheetMusic = new StockSheetMusic("John Williams Movie Favourites for easy electric keyboard", movieFavourites, buyingPrice, sellingPrice);
    }

    @Test
    public void hasDescription(){
        assertEquals("John Williams Movie Favourites for easy electric keyboard", stockSheetMusic.getDescription());
    }

    @Test
    public void hasItem(){
        assertEquals(movieFavourites, stockSheetMusic.getItem());
    }

    @Test
    public void hasBuyingPrice(){
        assertTrue(BigDecimal.valueOf(4.00).compareTo(stockSheetMusic.getBuyingPrice()) == 0);
        assertEquals(4.00, stockSheetMusic.getBuyingPrice().doubleValue(), 0.0);

    }

    @Test
    public void hasSellingPrice() {
        assertEquals(7.00, stockSheetMusic.getSellingPrice().doubleValue(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.00, stockSheetMusic.calculateMarkup().doubleValue(), 0.0);
    }

}