import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(){
        this.stock = new ArrayList<>();
    }

    public void addItemToStock(ISell retailItem){
        stock.add(retailItem);
    }

    public void removeItemFromStock(ISell retailItem){
        stock.remove(retailItem);
    }

}
