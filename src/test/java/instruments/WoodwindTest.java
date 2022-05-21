package instruments;

import instruments.wind.Brass;
import instruments.wind.Pitch;
import instruments.wind.ReedType;
import instruments.wind.Woodwind;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WoodwindTest {

    Woodwind altoSax;

    @Before
    public void before(){
        altoSax = new Woodwind("Alto Saxophone", InstrumentType.WIND, SubType.WOODWIND, MaterialType.BRASS, "Vuum vuuuum", Pitch.Eb, ReedType.SINGLE);
    }

    @Test
    public void hasName(){
        assertEquals("Alto Saxophone", altoSax.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WIND, altoSax.getInstrumentType());
    }

    @Test
    public void hasSubType(){
        assertEquals(SubType.WOODWIND, altoSax.getSubType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(MaterialType.BRASS, altoSax.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("Vuum vuuuum", altoSax.getSound());
    }

    @Test
    public void hasPitch(){
        assertEquals(Pitch.Eb, altoSax.getPitch());
    }

    @Test
    public void hasReed(){
        assertEquals(ReedType.SINGLE, altoSax.getReed());
    }

    @Test
    public void canPlay(){
        assertEquals("The alto saxophone plays 'vuum vuuuum'!", altoSax.play());
    }

}