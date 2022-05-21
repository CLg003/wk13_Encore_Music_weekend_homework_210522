package instruments;

import behaviours.IPlay;
import noninstrumental.Accessory;

import java.util.ArrayList;

public abstract class Instrument implements IPlay {

    private String instrumentName;
    private InstrumentType instrumentType;
    private SubType subType;
    private MaterialType material;
    private String sound;

    public Instrument(String instrumentName, InstrumentType instrumentType, SubType subType, MaterialType material, String sound){
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.subType = subType;
        this.material = material;
        this.sound = sound;
    }

    public String play(){
        return sound;
    }
}
