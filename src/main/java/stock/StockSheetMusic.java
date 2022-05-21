package stock;

import behaviours.ISell;
import noninstrumental.Accessory;
import noninstrumental.SheetMusic;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class StockSheetMusic implements ISell {

    private String description;
    private SheetMusic item;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public StockSheetMusic(String description, SheetMusic item, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.description = description;
        this.item = item;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public SheetMusic getItem() {
        return item;
    }

    public BigDecimal getBuyingPrice() {
        return buyingPrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public BigDecimal calculateMarkup() {
        BigDecimal markup =  sellingPrice.subtract(buyingPrice).setScale(2, RoundingMode.HALF_UP);
        return markup;
    }

}
