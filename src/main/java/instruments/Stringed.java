package instruments;

public class Stringed extends Instrument{

    private int numberOfStrings;
    private boolean electric;

    public Stringed(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, int numberOfStrings, boolean electric) {
        super(name, instrumentType, subType, material, sound);
        this.numberOfStrings = numberOfStrings;
        this.electric = electric;
    }
}
