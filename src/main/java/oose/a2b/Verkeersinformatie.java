package oose.a2b;

import java.util.ArrayList;
import java.util.List;

public abstract class Verkeersinformatie extends Verbindingsstuk {
    private Systeem systeem;

    private File file;

    private Flitspaal flitspaal;

    private Belemmering belemmering;

    private Radarcontrole radarcontrole;

    private ArrayList<Verbindingsstuk> verbindingsstuk = new ArrayList<Verbindingsstuk>();

    private Verkeersmelding verkeersmelding;

    public abstract String beschrijving();

    public abstract boolean verwijderen();
}
