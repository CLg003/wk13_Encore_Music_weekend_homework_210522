package retail;

import behaviours.ISell;
import instruments.Instrument;

import java.math.BigDecimal;

public class InstrumentRetail implements ISell {

    private Instrument retailItem;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public InstrumentRetail(Instrument retailItem, BigDecimal buyingPrice, BigDecimal sellingPrice){
        this.retailItem = retailItem;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
