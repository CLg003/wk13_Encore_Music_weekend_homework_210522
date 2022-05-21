package instruments.wind;

import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.SubType;

public class Brass extends Wind{

    private int numberOfValves;

    public Brass(String name, InstrumentType instrumentType, SubType subType, MaterialType material, String sound, Pitch pitch, int numberOfValves) {
        super(name, instrumentType, subType, material, sound, pitch);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

}
