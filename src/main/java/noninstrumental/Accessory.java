package noninstrumental;

import instruments.InstrumentType;
import instruments.SubType;

public class Accessory {

    private String name;
    private String brand;
    private InstrumentType instrumentType;
    private SubType subType;

    public Accessory(String name, String brand, InstrumentType instrumentType, SubType subType){
        this.name = name;
        this.brand = brand;
        this.instrumentType = instrumentType;
        this.subType = subType;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public SubType getSubType() {
        return subType;
    }
}
