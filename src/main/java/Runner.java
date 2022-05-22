import instruments.InstrumentType;
import instruments.Keyboard;
import instruments.MaterialType;
import instruments.SubType;
import stock.StockInstrument;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // music shop
        MusicShop musicShop;
        musicShop = new MusicShop();

        // piano
        Keyboard piano;
        BigDecimal pianoBuyingPrice;
        BigDecimal pianoSellingPrice;
        StockInstrument stockPiano;
        piano = new Keyboard("Piano", InstrumentType.KEYBOARD, SubType.PIANO, MaterialType.WOOD, "Plinky plonk", 2);
        pianoBuyingPrice = new BigDecimal(20000.00);
        pianoSellingPrice = new BigDecimal(27000.00);
        stockPiano = new StockInstrument("Steinway concert grand piano", piano, pianoBuyingPrice, pianoSellingPrice);

        // input/output
        System.out.print("Hello, and welcome to your music shop stock manager. You are logged in as Encore Music, Edinburgh.\n");
        System.out.printf("Your current stock level is %d items.\n", musicShop.getStock().size());
        System.out.printf("A customer would like to sell you a %s for £%.2f. Would you like to buy the %s and add it to your stock? Y/N ", stockPiano.getDescription(), (stockPiano.getBuyingPrice()), stockPiano.getItem().getName().toLowerCase());
        String answer = in.nextLine();
        System.out.println(answer);
        if (answer.toLowerCase().equals("y")) {
            System.out.printf("Thank you. The %s has been added to stock. View item details? Y/N \n", stockPiano.getDescription());
            answer = in.nextLine();
            if (answer.toLowerCase().equals("y")) {
                System.out.printf("Item name: %s \nItem description: %s \nItem buying price: £%.2f \nExpected item selling price: £%.2f \nItem markup: £%.2f\n", stockPiano.getItem().getName(), stockPiano.getDescription(), stockPiano.getBuyingPrice(), stockPiano.getSellingPrice(), stockPiano.calculateMarkup());
            }
        }

    }

}
