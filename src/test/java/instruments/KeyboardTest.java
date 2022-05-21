package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    Keyboard electricKeyboard;

    @Before
    public void before() {
        electricKeyboard = new Keyboard("Electric Keyboard", InstrumentType.KEYBOARD, SubType.KEYBOARD, MaterialType.PLASTIC, "Dinky donk", 0);
    }

    @Test
    public void hasName() {
        assertEquals("Electric Keyboard", electricKeyboard.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, electricKeyboard.getInstrumentType());
    }

    @Test
    public void hasSubType(){
        assertEquals(SubType.KEYBOARD, electricKeyboard.getSubType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(MaterialType.PLASTIC, electricKeyboard.getMaterial());
    }

    @Test
    public void hasSound(){
        assertEquals("Dinky donk", electricKeyboard.getSound());
    }

    @Test
    public void hasNumberOfPedals(){
        assertEquals(0, electricKeyboard.getNumberOfPedals());
    }

    @Test
    public void canPlay(){
        assertEquals("The electric keyboard plays 'dinky donk'!", electricKeyboard.play());
    }
}