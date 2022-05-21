package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion drumKit;

    @Before
    public void before(){
        drumKit = new Percussion("Drum Kit", InstrumentType.PERCUSSION, SubType.UNTUNED, MaterialType.WOOD, "Prrrrrr, bad-um-tish");
    }

    @Test
    public void hasName(){
        assertEquals("Drum Kit", drumKit.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drumKit.getInstrumentType());
    }

    @Test
    public void hasSubType(){
        assertEquals(SubType.UNTUNED, drumKit.getSubType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(MaterialType.WOOD, drumKit.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("Prrrrrr, bad-um-tish", drumKit.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("The drum kit plays 'prrrrrr, bad-um-tish'!", drumKit.play());
    }
}
