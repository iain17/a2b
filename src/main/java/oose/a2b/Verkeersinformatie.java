package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public abstract class Verkeersinformatie {


    protected Verbindingsstuk verbindingsstuk;

    public Verkeersinformatie(Verbindingsstuk verbindingsstuk) {
        this.verbindingsstuk = verbindingsstuk;
        verbindingsstuk.addVerkeersinformatie(this);
    }

    public abstract String beschrijving();

    public boolean verwijderen() {
        return this.verbindingsstuk.removeVerkeersinformatie(this);
    }

    public float getMinuten() {
        return 0;
    }
}
