import instruments.InstrumentType;
import instruments.Keyboard;
import instruments.MaterialType;
import instruments.SubType;
import noninstrumental.Accessory;
import noninstrumental.SheetMusic;
import org.junit.Before;
import org.junit.Test;
import stock.StockAccessory;
import stock.StockInstrument;
import stock.StockSheetMusic;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MusicShopTest {

    MusicShop musicShop;
    // guitar strings
    Accessory guitarStrings;
    BigDecimal guitarStringsBuyingPrice;
    BigDecimal guitarStringsSellingPrice;
    StockAccessory stockGuitarStrings;
    // piano
    Keyboard piano;
    BigDecimal pianoBuyingPrice;
    BigDecimal pianoSellingPrice;
    StockInstrument stockPiano;
    // sheet music
    Keyboard electricKeyboard;
    SheetMusic movieFavourites;
    BigDecimal sheetMusicBuyingPrice;
    BigDecimal sheetMusicSellingPrice;
    StockSheetMusic stockSheetMusic;

    @Before
    public void before(){
        musicShop = new MusicShop();
        // guitar strings - stock accessory:
        guitarStrings = new Accessory("Guitar strings", "Gibson", InstrumentType.STRING, SubType.PLUCKED);
        guitarStringsBuyingPrice = new BigDecimal(4.50);
        guitarStringsSellingPrice = new BigDecimal(9.79);
        stockGuitarStrings = new StockAccessory("Set of Gibson electric guitar strings", guitarStrings, guitarStringsBuyingPrice, guitarStringsSellingPrice);

        // piano - stock instrument
        piano = new Keyboard("Piano", InstrumentType.KEYBOARD, SubType.PIANO, MaterialType.WOOD, "Plinky plonk", 2);
        pianoBuyingPrice = new BigDecimal(20000.00);
        pianoSellingPrice = new BigDecimal(27000.00);
        stockPiano = new StockInstrument("Steinway concert grand piano", piano, pianoBuyingPrice, pianoSellingPrice);

        // movie favourites - stock sheet music
        electricKeyboard = new Keyboard("Electric Keyboard", InstrumentType.KEYBOARD, SubType.KEYBOARD, MaterialType.PLASTIC, "Dinky donk", 0);
        movieFavourites = new SheetMusic("Movie Favourites", "John Williams", electricKeyboard);
        sheetMusicBuyingPrice = new BigDecimal(4.00);
        sheetMusicSellingPrice = new BigDecimal(7.00);
        stockSheetMusic = new StockSheetMusic("John Williams Movie Favourites for easy electric keyboard", movieFavourites, sheetMusicBuyingPrice, sheetMusicSellingPrice);
    }

    @Test
    public void startsWithEmptyStock(){
        assertEquals(0, musicShop.getStock().size());
    }

    @Test
    public void canAddItemToStock(){
        musicShop.addItemToStock(stockPiano);
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        musicShop.addItemToStock(stockPiano);
        musicShop.addItemToStock(stockGuitarStrings);
        musicShop.removeItemFromStock(stockPiano);
        assertEquals(1, musicShop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        musicShop.addItemToStock(stockPiano);
        musicShop.addItemToStock(stockSheetMusic);
        musicShop.addItemToStock(stockGuitarStrings);
        assertEquals(7008.29, musicShop.calculateTotalPotentialProfit().doubleValue(), 0.0);
    }

}