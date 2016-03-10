package oose.a2b;

public class Flitspaal extends Verkeersinformatie {
    private float hectometerpaal;

    public Flitspaal(float hectometerpaal, Verbindingsstuk verbindingsstuk) {
        super(verbindingsstuk);
        this.hectometerpaal = hectometerpaal;
    }

    public boolean wijzigen(float hectometerpaal) {
        this.hectometerpaal = hectometerpaal;
        return true;
    }

    @Override
    public String beschrijving() {
        return String.format("Een flitspaal bij hectometerpaal: %.1f", hectometerpaal);
    }

}
