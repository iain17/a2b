package oose.a2b;

public class Flitspaal extends Verkeersinformatie {
    private float hectometerpaal;
    private Verkeersinformatie verkeersinformatie;

    public Flitspaal(float hectometerpaal, Verbindingsstuk verbindingsstuk) {
        super(verbindingsstuk);
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
