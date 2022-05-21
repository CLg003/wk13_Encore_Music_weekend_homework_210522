package noninstrumental;

import instruments.Instrument;
import instruments.InstrumentType;
import instruments.SubType;

public class Accessory {

    private String name;
    private InstrumentType forInstrumentType;
    private SubType forSubType;

    public Accessory(String name, InstrumentType forInstrumentType, SubType forSubType){
        this.name = name;
        this.forInstrumentType = forInstrumentType;
        this.forSubType = forSubType;
    }
}
