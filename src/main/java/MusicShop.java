import behaviours.ISell;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell retailItem){
        stock.add(retailItem);
    }

    public void removeItemFromStock(ISell retailItem){
        stock.remove(retailItem);
    }

//    public BigDecimal calculateTotalPotentialProfit(){
//        BigDecimal totalPotentialProfit = new BigDecimal(0.00);
//        for (ISell stockItem : stock){
//            BigDecimal sellingPrice = stockItem.getSellingPrice();
//            BigDecimal buyingPrice = stockItem.getBuyingPrice();
//            BigDecimal itemMarkup =  stockItem.getSellingPrice().subtract(buyingPrice).setScale(2, RoundingMode.HALF_UP);
//
//        }


    }

}
