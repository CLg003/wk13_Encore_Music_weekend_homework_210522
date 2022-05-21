package instruments.wind;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.SubType;

public abstract class Wind extends Instrument {

    private Pitch pitch;

    public Wind(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, Pitch pitch) {
        super(name, instrumentType, subType, material, sound);
        this.pitch = pitch;
    }

    public Pitch getPitch() {
        return pitch;
    }
}
