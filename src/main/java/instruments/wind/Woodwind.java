package instruments.wind;

import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.SubType;

public class Woodwind extends Wind{

    private ReedType reed;

    public Woodwind(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, Pitch pitch, ReedType reed) {
        super(name, instrumentType, subType, material, sound, pitch);
        this.reed = reed;
    }
}
