import instruments.*;
import noninstrumental.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;
    Keyboard piano;

    @Before
    public void before(){
        piano = new Keyboard("Piano", InstrumentType.KEYBOARD, SubType.PIANO, MaterialType.WOOD, "plinky plonk", 2);
        sheetMusic = new SheetMusic("Rhapsody in Blue", "George Gershwin", piano);
    }

    @Test
    public void hasTitle(){
        assertEquals("Rhapsody in Blue", sheetMusic.getTitle());
    }

    @Test
    public void hasComposer(){
        assertEquals("George Gershwin", sheetMusic.getComposer());
    }

    @Test
    public void hasInstrument(){
        assertEquals(piano, sheetMusic.getInstrument());
    }
}
