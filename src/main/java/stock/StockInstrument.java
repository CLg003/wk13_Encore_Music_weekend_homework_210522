package stock;

import behaviours.ISell;
import instruments.Instrument;
import noninstrumental.Accessory;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class StockInstrument implements ISell {

    private String description;
    private Instrument item;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public StockInstrument(String description, Instrument item, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.description = description;
        this.item = item;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public Instrument getItem() {
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
