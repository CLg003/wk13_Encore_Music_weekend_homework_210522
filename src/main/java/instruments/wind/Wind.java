package instruments.wind;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.SubType;

public class Wind extends Instrument {

    private PitchType pitch;

    public Wind(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, PitchType pitch) {
        super(name, instrumentType, subType, material, sound);
        this.pitch = pitch;
    }
}
