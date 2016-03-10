package oose.a2b;

public class Radarcontrole extends Verkeersinformatie {
    private float hectometerpaal;

    public Radarcontrole(float hectometerpaal, Verbindingsstuk verbindingsstuk) {
        super(verbindingsstuk);
        this.hectometerpaal = hectometerpaal;
    }

    public boolean wijzigen(float hectometerpaal) {
        this.hectometerpaal = hectometerpaal;
        return true;
    }

    @Override
    public String beschrijving() {
        return String.format("Een radarcontrole bij hectometerpaal: %.1f", hectometerpaal);
    }
}
