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

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
