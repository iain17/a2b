package oose.a2b;

import java.util.Date;

public class Belemmering extends Verkeersinformatie {
    private String beschrijving;
    private String van;
    private String tot;

    public Belemmering(String beschrijving, String van, String tot, Verbindingsstuk verbindingsstuk) {
        super(verbindingsstuk);
        this.beschrijving = beschrijving;
        this.van = van;
        this.tot = tot;
    }

    public boolean wijzigen(String beschrijving, String van, String tot) {
        this.beschrijving = beschrijving;
        this.van = van;
        this.tot = tot;
        return true;
    }

    @Override
    public String beschrijving() {
        return String.format("%s van %s tot %s.",beschrijving, van, tot);
    }
}
