package stock;

import behaviours.ISell;
import noninstrumental.Accessory;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class StockAccessory implements ISell {

    private String description;
    private Accessory item;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public StockAccessory(String description, Accessory item, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.description = description;
        this.item = item;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public Accessory getItem() {
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
