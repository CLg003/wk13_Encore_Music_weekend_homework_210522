package retail;

import behaviours.ISell;
import noninstrumental.SheetMusic;

import java.math.BigDecimal;

public class SheetMusicRetail implements ISell {

    private String itemDescription;
    private SheetMusic retailItem;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public SheetMusicRetail(String itemDescription, SheetMusic retailItem, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.itemDescription = itemDescription;
        this.retailItem = retailItem;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

//    public BigDecimal calculateMarkup() {
//        return sellingPrice - buyingPrice;
//    }

}
