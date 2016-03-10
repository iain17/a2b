package oose.a2b;

import java.util.Date;

public class Belemmering extends Verkeersinformatie {
    private String beschrijving;

    private Date van;

    private Date tot;

    private Verkeersinformatie verkeersinformatie;

    public Belemmering(String beschrijving, Date van, Date tot, Verkeersinformatie verkeersinformatie) {
        this.beschrijving = beschrijving;
        this.van = van;
        this.tot = tot;
        this.verkeersinformatie = verkeersinformatie;
    }

    public boolean wijzigen(String beschrijving, Date van, Date tot) {
        return false;
    }

    @Override
    public String beschrijving() {
        return null;
    }

    @Override
    public boolean verwijderen() {
        return false;
    }
}
