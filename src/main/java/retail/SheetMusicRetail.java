package retail;

import behaviours.ISell;
import noninstrumental.SheetMusic;

import java.math.BigDecimal;

public class SheetMusicRetail implements ISell {

    private SheetMusic retailItem;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public SheetMusicRetail(SheetMusic retailItem, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.retailItem = retailItem;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

//    public BigDecimal calculateMarkup() {
//        return sellingPrice - buyingPrice;
//    }

}
