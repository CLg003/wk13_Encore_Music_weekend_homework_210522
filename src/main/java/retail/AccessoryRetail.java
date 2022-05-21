package retail;

import behaviours.ISell;
import noninstrumental.Accessory;

import java.math.BigDecimal;

public class AccessoryRetail implements ISell {

    private Accessory retailItem;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public AccessoryRetail(Accessory retailItem, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.retailItem = retailItem;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

//    public BigDecimal calculateMarkup() {
//        return sellingPrice - buyingPrice;
//    }

}
