package instruments;

public class Keyboard extends Instrument{

    private int numberOfPedals;

    public Keyboard(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, int numberOfPedals) {
        super(name, instrumentType, subType, material, sound);
        this.numberOfPedals = numberOfPedals;
    }
}
