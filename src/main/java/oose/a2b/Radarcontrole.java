package oose.a2b;

public class Radarcontrole extends Verkeersinformatie {
    private float hectometerpaal;
    private Verkeersinformatie verkeersinformatie;

    public Radarcontrole(float hectometerpaal, Verkeersinformatie verkeersinformatie) {
        this.hectometerpaal = hectometerpaal;
        this.verkeersinformatie = verkeersinformatie;
    }

    public boolean wijzigen(float hectometerpaal) {
        return false;
    }

    @Override
    public String beschrijving() {
        return null;
    }
}
