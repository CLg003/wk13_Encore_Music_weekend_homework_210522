package instruments;

import instruments.wind.Brass;
import instruments.wind.Pitch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrassTest {

    Brass trombone;

    @Before
    public void before(){
        trombone = new Brass("Trombone", InstrumentType.WIND, SubType.BRASS, MaterialType.BRASS, "Wah waaah", Pitch.Bb, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Trombone", trombone.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WIND, trombone.getInstrumentType());
    }

    @Test
    public void hasSubType(){
        assertEquals(SubType.BRASS, trombone.getSubType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(MaterialType.BRASS, trombone.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("Wah waaah", trombone.getSound());
    }

        @Test
    public void hasPitch(){
        assertEquals(Pitch.Bb, trombone.getPitch());
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(3, trombone.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("The trombone plays 'wah waaah'!", trombone.play());
    }


}