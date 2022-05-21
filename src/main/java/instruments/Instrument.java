package instruments;

import behaviours.IPlay;
import noninstrumental.Accessory;

import java.util.ArrayList;
import java.util.Locale;

public abstract class Instrument implements IPlay {

    private String name;
    private InstrumentType instrumentType;
    private SubType subType;
    private MaterialType material;
    private String sound;

    public Instrument(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound){
        this.name = name;
        this.instrumentType = instrumentType;
        this.subType = subType;
        this.material = material;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public SubType getSubType() {
        return subType;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public String getSound() {
        return sound;
    }

    public String play(){
        return String.format("The %s plays '%s'!", name.toLowerCase(), sound.toLowerCase());
    }

}
