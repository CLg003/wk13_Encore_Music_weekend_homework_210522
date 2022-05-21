import instruments.InstrumentType;
import instruments.SubType;
import noninstrumental.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Vandoren no.3 Alto Sax reed", InstrumentType.WIND, SubType.WOODWIND);
    }

    @Test
    public void hasName(){
        assertEquals("Vandoren no.3 Alto Sax reed", accessory.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WIND, accessory.getInstrumentType());
    }

    @Test
    public void hasSubType(){
        assertEquals(SubType.WOODWIND, accessory.getSubType());
    }
}
