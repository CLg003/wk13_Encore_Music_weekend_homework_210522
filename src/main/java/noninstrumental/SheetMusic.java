package noninstrumental;

import instruments.Instrument;

public class SheetMusic {

    private String title;
    private String composer;
    private Instrument instrument;

    public SheetMusic(String title, String composer, Instrument instrument){
        this.title = title;
        this.composer = composer;
        this.instrument = instrument;
    }
}
