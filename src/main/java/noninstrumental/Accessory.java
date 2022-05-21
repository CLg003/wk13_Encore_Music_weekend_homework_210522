package noninstrumental;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.SubType;

public class Accessory {

    private String name;
    private InstrumentType instrumentType;
    private SubType subType;

    public Accessory(String name, InstrumentType instrumentType, SubType subType){
        this.name = name;
        this.instrumentType = instrumentType;
        this.subType = subType;
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
}
