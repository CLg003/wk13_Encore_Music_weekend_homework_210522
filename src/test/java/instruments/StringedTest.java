package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringedTest {

    Stringed cello;

    @Before
    public void before(){
        cello = new Stringed("Cello", InstrumentType.STRING, SubType.BOWED, MaterialType.WOOD, "Zhjjjoooo zhjjjoooo", 4, false);
    }

    @Test
    public void hasName(){
        assertEquals("Cello", cello.getName());
    }

    @Test
    public void hasInstrumentType(){
assertEquals(InstrumentType.STRING, cello.getInstrumentType());
    }

    @Test
    public void hasSubType(){
assertEquals(SubType.BOWED, cello.getSubType());
    }

    @Test
    public void hasMaterial(){
assertEquals(MaterialType.WOOD, cello.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("Zhjjjoooo zhjjjoooo", cello.getSound());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(4, cello.getNumberOfStrings());
    }

    @Test
    public void hasElectricBoolean(){
        assertEquals(false, cello.isElectric());
    }

    @Test
    public void canPlay(){
        assertEquals("The cello plays 'zhjjjoooo zhjjjoooo'!", cello.play());
    }
}
